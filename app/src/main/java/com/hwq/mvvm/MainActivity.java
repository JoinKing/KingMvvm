package com.hwq.mvvm;

import android.os.Bundle;
import android.os.Handler;
import com.hwq.lib_common.base.BaseActivity;
import com.hwq.lib_common.base.BaseViewModel;
import com.hwq.lib_common.utils.KLog;
import com.hwq.mvvm.databinding.ActivityMainBinding;
import com.hwq.mvvm.main.App;
import com.hwq.mvvm.main.LoginManager;
import com.tencent.mm.opensdk.openapi.IWXAPI;

public class MainActivity extends BaseActivity<ActivityMainBinding,MainVM> {

    @Override
    public void initData() {

    }

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }



    @Override
    public int initVariableId() {
        return com.hwq.mvvm.BR.mainVM;
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding.mWebView.removeAllViews();
        binding.mWebView.destroy();
    }

    @Override
    public void initParam() {
        super.initParam();

        Bundle bundle = getIntent().getExtras();

        if (null!=bundle){
            KLog.e( bundle.getString("filePath"));
        }else {
            KLog.e("null");
        }






    }

}
