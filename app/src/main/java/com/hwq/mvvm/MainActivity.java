package com.hwq.mvvm;

import android.os.Bundle;
import android.os.Handler;
import com.hwq.lib_common.base.BaseActivity;
import com.hwq.mvvm.databinding.ActivityMainBinding;
import com.hwq.mvvm.main.App;
import com.hwq.mvvm.main.LoginManager;

public class MainActivity extends BaseActivity<ActivityMainBinding,MainVM> {

    private Handler handler = new Handler();


    private void init() {

//        LoginManager.getInstance(this);

//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                binding.textView.setText("内存泄漏");
//        }
//        },3000);
    }

    @Override
    public void initData() {
        init();
    }


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
