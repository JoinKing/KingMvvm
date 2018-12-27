package com.hwq.mvvm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hwq.lib_common.utils.FixMemLeak;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解决华为手机输入事件引起得内存泄漏问题
        FixMemLeak.fixLeak(this);
    }
}
