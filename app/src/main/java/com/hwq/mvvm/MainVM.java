package com.hwq.mvvm;

import android.app.Application;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import com.hwq.lib_common.base.BaseViewModel;
import com.hwq.lib_common.binding.command.BindingAction;
import com.hwq.lib_common.binding.command.BindingCommand;
import com.hwq.lib_common.http.BaseResponse;
import com.hwq.lib_common.http.ResponseThrowable;
import com.hwq.lib_common.http.utils.RetrofitClient;
import com.hwq.lib_common.utils.KLog;
import com.hwq.lib_common.utils.KeyBoardUtils;
import com.hwq.lib_common.utils.RxUtils;
import com.hwq.mvvm.api.ApiService;
import com.hwq.mvvm.bean.StrBean;
import com.hwq.mvvm.xxx.IMMLeaks;
import com.trello.rxlifecycle2.LifecycleProvider;

import io.reactivex.functions.Consumer;

public class MainVM extends BaseViewModel{

    public ObservableField<String>text = new ObservableField<>("测试");

    public MainVM(@NonNull Application application) {
        super(application);
    }


    //登录按钮的点击事件
    public BindingCommand loginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            startActivity(Main2Activity.class);
            finish();
        }
    });

    @Override
    public void onCreate() {
        super.onCreate();
        requestNetWork();
        KLog.e("accept:onCreate");
    }

    void requestNetWork() {
        RetrofitClient.getInstance()
                .create(ApiService.class)
                .getText()
                .compose(RxUtils.bindToLifecycle(getLifecycleProvider())) // 请求与View周期同步
                .compose(RxUtils.schedulersTransformer())  // 线程调度
                .compose(RxUtils.exceptionTransformer())   // 网络错误的异常转换
                .subscribe(new Consumer<BaseResponse<StrBean>>() {
                    @Override
                    public void accept(BaseResponse<StrBean> response) throws Exception {
                        KLog.e("accept",response.getResult().getXxxx());
                        text.set(response.getResult().getXxxx());

                    }
                }, new Consumer<ResponseThrowable>() {
                    @Override
                    public void accept(ResponseThrowable throwable) throws Exception {
                        KLog.e("accept1",throwable.getMessage());
                        KLog.e("accept1",throwable.message);

                    }
                });
    }
}
