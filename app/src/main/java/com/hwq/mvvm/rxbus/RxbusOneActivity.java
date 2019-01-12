package com.hwq.mvvm.rxbus;

import android.os.Bundle;

import com.hwq.lib_common.base.BaseActivity;
import com.hwq.mvvm.BR;
import com.hwq.mvvm.R;
import com.hwq.mvvm.databinding.ActivityRxbusOneBinding;
import com.hwq.mvvm.rxbus.vm.RxbusOneViewModel;

public class RxbusOneActivity extends BaseActivity<ActivityRxbusOneBinding,RxbusOneViewModel> {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_rxbus_one;
    }

    @Override
    public int initVariableId() {
        return BR.oneVm;
    }
}
