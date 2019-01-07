package com.hwq.mvvm;

import android.os.Bundle;
import android.os.Handler;
import com.hwq.lib_common.base.BaseActivity;
import com.hwq.mvvm.databinding.ActivityMainBinding;
import com.hwq.mvvm.main.App;
import com.hwq.mvvm.main.LoginManager;

public class MainActivity extends BaseActivity<ActivityMainBinding,MainVM> {

    @Override
    public void initData() {  }

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }



    @Override
    public int initVariableId() {
        return BR.mainVM;
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
