package com.hwq.mvvm.rxbus;

import android.os.Bundle;

import com.hwq.lib_common.base.BaseActivity;
import com.hwq.mvvm.BR;
import com.hwq.mvvm.R;
import com.hwq.mvvm.databinding.ActivityRxbusTwoBinding;
import com.hwq.mvvm.rxbus.vm.RxbusTwoViewModel;

public class RxbusTwoActivity extends BaseActivity<ActivityRxbusTwoBinding,RxbusTwoViewModel> {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_rxbus_two;
    }

    @Override
    public int initVariableId() {
        return BR.twoVm;
    }
}
