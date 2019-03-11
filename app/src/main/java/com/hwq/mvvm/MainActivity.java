package com.hwq.mvvm;

import android.os.Bundle;

import com.hwq.lib_common.widget.title.TitleViewModel;
import com.hwq.mvvm.BR;
import com.hwq.lib_common.base.BaseActivity;
import com.hwq.lib_common.utils.KLog;
import com.hwq.mvvm.databinding.ActivityMainBinding;


public class MainActivity extends BaseActivity<ActivityMainBinding,MainVM> {

    @Override
    public void initData() {

        //创建TitleViewModel
        TitleViewModel titleViewModel = createViewModel(this, TitleViewModel.class);
        viewModel.setTitleViewModel(titleViewModel);

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
