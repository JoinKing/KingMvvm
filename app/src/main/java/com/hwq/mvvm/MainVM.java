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
import com.hwq.lib_common.utils.RxUtils;
import com.hwq.mvvm.api.ApiService;
import com.hwq.mvvm.api.MovieSubscribe;
import com.hwq.mvvm.bean.LoginModel;
import com.hwq.mvvm.bean.StrBean;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.functions.Consumer;
import io.reactivex.observers.DisposableObserver;

public class MainVM extends BaseViewModel {

    public ObservableField<String> text = new ObservableField<>("测试");

    public MainVM(@NonNull Application application) {
        super(application);
    }


    //登录按钮的点击事件
    public BindingCommand loginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            startActivity(Main2Activity.class);
//            finish();
        }
    });

    @Override
    public void onCreate() {
        super.onCreate();
        requestNetWork();
        KLog.e("accept:onCreate");
    }

    void requestNetWork() {

        /**
         * 请求一
         */
        MovieSubscribe.getLogin("17688831088", "Aa1234", new DisposableObserver<BaseResponse<LoginModel>>() {
            @Override
            public void onNext(BaseResponse<LoginModel> response) {
                KLog.e("accept:onCreate" + response.getResult());
                text.set(response.getResult().toString());
            }

            @Override
            public void onError(Throwable e) {
                KLog.e("accept:Throwable" + e.getMessage());
            }

            @Override
            public void onComplete() {
                KLog.e("accept:onComplete");
            }
        });
        MovieSubscribe.getText(new DisposableObserver<BaseResponse<StrBean>>() {
            @Override
            public void onNext(BaseResponse<StrBean> response) {
                text.set(response.getResult().toString());
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });


        /**
         * 请求二
         */
        Map<String, String> map = new HashMap<>();
        map.put("phone", "17688831088");
        map.put("psd", "Aa1234");
        RetrofitClient.getInstance()
                .create(ApiService.class)
                .getLogin(map)
                .compose(RxUtils.bindToLifecycle(getLifecycleProvider())) // 请求与View周期同步
                .compose(RxUtils.schedulersTransformer())  // 线程调度
                .compose(RxUtils.exceptionTransformer())   // 网络错误的异常转换
                .subscribe(new Consumer<BaseResponse<LoginModel>>() {

                    @Override
                    public void accept(BaseResponse<LoginModel> response) throws Exception {
                        text.set(response.getResult().toString());

                    }
                }, new Consumer<ResponseThrowable>() {
                    @Override
                    public void accept(ResponseThrowable throwable) throws Exception {

                    }
                });
//        RetrofitClient.getInstance()
//                .create(ApiService.class)
//                .getText()
//                .compose(RxUtils.bindToLifecycle(getLifecycleProvider())) // 请求与View周期同步
//                .compose(RxUtils.schedulersTransformer())  // 线程调度
//                .compose(RxUtils.exceptionTransformer())   // 网络错误的异常转换
//                .subscribe(new Consumer<BaseResponse<StrBean>>() {
//                    @Override
//                    public void accept(BaseResponse<StrBean> response) throws Exception {
//                        KLog.e("accept",response.getResult().getXxxx());
//                        text.set(response.getResult().getXxxx());
//
//                    }
//                }, new Consumer<ResponseThrowable>() {
//                    @Override
//                    public void accept(ResponseThrowable throwable) throws Exception {
//                        KLog.e("accept1",throwable.getMessage());
//                        KLog.e("accept1",throwable.message);
//
//                    }
//                });
    }
}
