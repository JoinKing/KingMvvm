package com.hwq.mvvm.live;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hwq.lib_common.base.BaseActivity;
import com.hwq.lib_common.utils.ToastUtils;
import com.hwq.mvvm.BR;
import com.hwq.mvvm.MainActivity;
import com.hwq.mvvm.R;
import com.hwq.mvvm.databinding.ActivityLiveBinding;
import com.hwq.mvvm.live.business.FspEvents;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class liveActivity extends BaseActivity<ActivityLiveBinding,LiveViewModel> {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_live;
    }



    @Override
    public int initVariableId() {
        return BR.liveVM;
    }

}
