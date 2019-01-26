package com.hwq.mvvm.cookbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hwq.lib_common.base.BaseActivity;
import com.hwq.lib_common.widget.cookbar.CookieBar;
import com.hwq.mvvm.BR;
import com.hwq.mvvm.MainActivity;
import com.hwq.mvvm.R;
import com.hwq.mvvm.databinding.ActivityCookBarBinding;

public class CookBarActivity extends BaseActivity<ActivityCookBarBinding,CookBarViewModel> {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_cook_bar;
    }

    @Override
    public int initVariableId() {
        return BR.cookVM;
    }

    @Override
    public void initData() {
        super.initData();

        binding.cookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //一个简单哪的CookieBar

                new CookieBar.Builder(CookBarActivity.this)
                        .setTitle("TITLE")
//                        .setMessage("MESSAGE")
                        .setBackgroundColor(R.color.default_action_color)
                        .show();


            }
        });
    }
}
