package com.hwq.mvvm.live.main;

import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.hwq.lib_common.base.BaseActivity;
import com.hwq.lib_common.base.BaseFragment;
import com.hwq.lib_common.utils.KLog;
import com.hwq.lib_common.utils.ToastUtils;
import com.hwq.lib_common.utils.Utils;
import com.hwq.mvvm.BR;
import com.hwq.mvvm.R;
import com.hwq.mvvm.databinding.ActivityLiveMainBinding;
import com.hwq.mvvm.live.FspUserView;
import com.hwq.mvvm.live.business.FspEvents;
import com.hwq.mvvm.live.business.FspManager;
import com.hwq.mvvm.live.utils.CheckListDialog;
import com.hwq.mvvm.live.utils.FspUtils;
import com.inpor.fsp.FspEngine;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

public class LiveMainActivity extends BaseActivity<ActivityLiveMainBinding,LivaMainViewModel> {


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_live_main;
    }

    @Override
    public int initVariableId() {
        return BR.liveMainvVM;
    }

    @Override
    public void initParam() {
        super.initParam();
        EventBus.getDefault().register(LiveMainActivity.this);
    }

    @Override
    public void initData() {
        super.initData();
        m_list_userviews = new ArrayList<>();
        m_list_userviews.add(binding.mainUserView1);
        m_list_userviews.add(binding.mainUserView2);
        m_list_userviews.add(binding.mainUserView3);
        m_list_userviews.add(binding.mainUserView4);
        m_list_userviews.add(binding.mainUserView5);
        m_list_userviews.add(binding.mainUserView6);
        startTimingToolbarHide();

        //可能在LoginActivity 切换 到 Mainactivtiy期间， 收到了 sdk的onRemoteVideoEvent
        //将保存的视频列表逐一打开
        FspManager fsm = FspManager.instatnce();

        for (Pair<String, String> remote_video_info : fsm.getRemoteVideos()) {
            FspUserView videoView = ensureUserView(remote_video_info.first, remote_video_info.second);
            if (videoView == null) {
                KLog.e("oncreate no releative userview: %s, %s"+ remote_video_info.first, remote_video_info.second);
            } else {
                videoView.useToRender(remote_video_info.first, remote_video_info.second);
                if (!fsm.setRemoteVideoRender(remote_video_info.first, remote_video_info.second, videoView.getSurfaceView())) {
                    videoView.freeRender();
                }
            }
        }

        for (String remote_audio_userid : fsm.getRemoteAudios()) {
            FspUserView videoView = ensureUserView(remote_audio_userid, null);
            if (videoView == null) {
                KLog.e("oncreate no releative videoview: %s", remote_audio_userid);
            } else {
                videoView.openAudio(remote_audio_userid);
            }
        }



        binding.toolbarBtnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.showShort("设置");
            }
        });
        binding.toolbarBtnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopTimingToolbarHide();

                final FspManager fspManger = FspManager.instatnce();
                final int curVideoState = fspManger.currentVideState();

                final ArrayList<String> videoDevices = new ArrayList<>();
                videoDevices.add("前置摄像头");
                videoDevices.add("后置摄像头");
                videoDevices.add("关闭视频");

                int nCurrentSelectedIndex = -1;
                if (curVideoState == FspManager.LOCAL_VIDEO_FRONT_PUBLISHED) {
                    nCurrentSelectedIndex = 0;
                } else if (curVideoState == FspManager.LOCAL_VIDEO_BACK_PUBLISHED) {
                    nCurrentSelectedIndex = 1;
                } else if (curVideoState == FspManager.LOCAL_VIDEO_CLOSED) {
                    nCurrentSelectedIndex = 2;
                }

                CheckListDialog.CheckListDialogListener selectListener = new CheckListDialog.CheckListDialogListener() {
                    @Override
                    public void onItemSelected(int selectedIndex) {
                        if (selectedIndex == 0) {
                            //选择前置摄像头
                            if (curVideoState != FspManager.LOCAL_VIDEO_FRONT_PUBLISHED) {
                                if (curVideoState == FspManager.LOCAL_VIDEO_CLOSED) {
                                    publishLocalVideo(true);
                                } else {
                                    fspManger.switchCamera();
                                }
                            }
                        } else if (selectedIndex == 1) {
                            //选择后置摄像头
                            if (curVideoState != FspManager.LOCAL_VIDEO_BACK_PUBLISHED) {
                                if (curVideoState == FspManager.LOCAL_VIDEO_CLOSED) {
                                    publishLocalVideo(false);
                                } else {
                                    fspManger.switchCamera();
                                }
                            }
                        } else if (selectedIndex == 2) {
                            //关闭摄像头
                            fspManger.stopVideoPublish();
                            FspUserView videoView = ensureUserView(fspManger.getSelfUserId(), "");
                            if (videoView != null) {
                                videoView.freeRender();
                            }
                            binding.toolbarBtnVideo.setImageResource(R.drawable.toolbar_video_closed_selector);
                        }
                    }
                };

                final CheckListDialog dialog = new CheckListDialog(
                        LiveMainActivity.this, "选择摄像头",
                        videoDevices, nCurrentSelectedIndex,
                        selectListener);

                dialog.show();
            }
        });


        binding.mainLayoutRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.toolbarLayoutMain.setVisibility(View.VISIBLE);
                stopTimingToolbarHide();
                startTimingToolbarHide();

            }
        });

        binding.toolbarBtnMicrophone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FspManager fsp = FspManager.instatnce();
                if (fsp.isAudioPublishing()) {
                    if (fsp.stopPublishAudio()) {
                        binding.toolbarBtnMicrophone.setImageResource(R.drawable.toolbar_audio_closed_selector);
                    }
                } else {
                    if (fsp.startPublishAudio()) {
                        binding.toolbarBtnMicrophone.setImageResource(R.drawable.toolbar_audio_opened_selector);
                    }
                }
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        EventBus.getDefault().unregister(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        m_isResumed = true;

        m_handler.postDelayed(m_OneSecondRunnable, 1000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        m_isResumed = false;
    }

    @Override
    public void onBackPressed() {
        if (!m_isQuiting) {
            Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
            m_isQuiting = true;

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(900);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        m_isQuiting = false;
                    }
                }
            }).start();

        } else {
            finish();
//            System.exit(0);
        }
    }

    List<FspUserView> m_list_userviews;
    private boolean m_isQuiting = false;
    private boolean m_isResumed = false;

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventRemoteVideo(FspEvents.RemoteVideoEvent event) {
        FspManager fspManager = FspManager.instatnce();
        FspUserView videoView = ensureUserView(event.userid, event.videoid);
        if (videoView == null) {
            KLog.e("onEventRemoteVideo no releative userview: %s, %s"+event.userid, event.videoid);
            return;
        }

        if (event.eventtype == FspEngine.REMOTE_VIDEO_PUBLISH_STARTED) {
            videoView.useToRender(event.userid, event.videoid);
            Log.e("testv", "renderview : " + videoView.getSurfaceView());
            if (!fspManager.setRemoteVideoRender(event.userid, event.videoid, videoView.getSurfaceView())) {
                videoView.freeRender();
            }
        } else if (event.eventtype == FspEngine.REMOTE_VIDEO_PUBLISH_STOPED) {
            videoView.freeRender();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventRemoteAudio(FspEvents.RemoteAudioEvent event) {
        FspUserView videoView = ensureUserView(event.userid, null);
        if (videoView == null) {
            KLog.e("onEventRemoteAudio no releative videoview: %s", event.userid);
            return;
        }

        if (event.eventtype == FspEngine.REMOTE_AUDIO_PUBLISH_STARTED) {
            videoView.openAudio(event.userid);
        } else if (event.eventtype == FspEngine.REMOTE_AUDIO_PUBLISH_STOPED) {
            videoView.closeAudio();
        }
    }

    private void publishLocalVideo(boolean isFront) {
        FspManager fspManager = FspManager.instatnce();
        FspUserView videoView = ensureUserView(fspManager.getSelfUserId(), "");
        if (videoView != null) {
            videoView.useToRender(fspManager.getSelfUserId(), "");
            if (fspManager.publishVideo(isFront, videoView.getSurfaceView())) {
                binding.toolbarBtnVideo.setImageResource(R.drawable.toolbar_video_opened_selector);
            } else {
                videoView.freeRender();
            }
        } else {
            KLog.e("not have more free video view");
        }
    }

    private FspUserView ensureUserView(String userid, String videoid) {
        FspUserView firstFreeView = null;
        FspUserView firstUserView = null;
        for (FspUserView userView : m_list_userviews) {
            if (FspUtils.isSameText(userid, userView.getUserId())) {
                if (FspUtils.isSameText(videoid, userView.getVideoId())) {
                    return userView;
                } else if (firstUserView == null &&
                        (FspUtils.isEmptyText(videoid) || FspUtils.isEmptyText(userView.getVideoId()))){
                    firstUserView = userView;
                }
            }

            if (firstFreeView == null && FspUtils.isEmptyText(userView.getUserId())) {
                firstFreeView = userView;
            }
        }

        if (firstUserView != null) {
            return firstUserView;
        }

        return firstFreeView;
    }

    private Handler m_handler = new Handler();

    private Runnable m_OneSecondRunnable = new Runnable() {
        @Override
        public void run() {
            if (!m_isResumed) {
                return;
            }
            try {
                m_handler.postDelayed(this, 1000);
                onOneSecondTimer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    private void onOneSecondTimer() {
        for (FspUserView userView : m_list_userviews) {
            userView.onOneSecondTimer();
        }
    }

    private Runnable m_toolBarTimingRunnable = new Runnable() {
        @Override
        public void run() {
            binding.toolbarLayoutMain.setVisibility(View.GONE);
        }
    };

    private void stopTimingToolbarHide() {
        m_handler.removeCallbacks(m_toolBarTimingRunnable);
    }

    private void startTimingToolbarHide() {
        m_handler.postDelayed(m_toolBarTimingRunnable, 5000);
    }


}
