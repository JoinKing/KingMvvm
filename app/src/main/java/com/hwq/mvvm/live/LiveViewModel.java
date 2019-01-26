package com.hwq.mvvm.live;

import android.Manifest;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

import com.hwq.lib_common.base.BaseViewModel;
import com.hwq.lib_common.binding.command.BindingAction;
import com.hwq.lib_common.binding.command.BindingCommand;
import com.hwq.lib_common.rxpermissions.RxPermissions;
import com.hwq.lib_common.utils.KLog;
import com.hwq.lib_common.utils.ToastUtils;
import com.hwq.mvvm.MainActivity;
import com.hwq.mvvm.R;
import com.hwq.mvvm.live.business.FspEvents;
import com.hwq.mvvm.live.business.FspManager;

import com.hwq.mvvm.live.main.LiveMainActivity;


import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import io.reactivex.functions.Consumer;


public class LiveViewModel extends BaseViewModel{
    public ObservableField<String> userName = new ObservableField<>("xx");
    public ObservableField<String> groopName = new ObservableField<>("2222");


    public LiveViewModel(@NonNull Application application) {
        super(application);
    }

    public BindingCommand commandLogin = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            login();
        }
    });

    @Override
    public void onCreate() {
        super.onCreate();
        EventBus.getDefault().register(this);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    private void login() {
        // 引擎创建成功后，必须要手动进行初始化

        RxPermissions rxPermissions = new RxPermissions((Activity) getLifecycleProvider());
        rxPermissions.request(PERMISSION_DOJOINGROUP)
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean aBoolean) throws Exception {
                        if (aBoolean) {
//                            ToastUtils.showShort("权限已经打开，直接跳入相机");
                            if (!FspManager.instatnce().joinGroup(groopName.get(), userName.get())) {
                                ToastUtils.showShort("登陆失败");
                            }
                        } else {
                            ToastUtils.showShort("权限被拒绝");
                        }
                    }
                });
    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventJoinGroupResult(FspEvents.JoinGroupResult joinGroupResult){
        if (joinGroupResult.isSucess) {
            startActivity(LiveMainActivity.class);
//            finish();
        } else {
            ToastUtils.showShort(joinGroupResult.desc);
        }
    }

    private static final String[] PERMISSION_DOJOINGROUP = new String[] {"android.permission.RECORD_AUDIO","android.permission.CAMERA"};

}
