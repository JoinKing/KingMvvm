package com.hwq.mvvm;

import android.app.Application;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.hwq.lib_common.base.BaseViewModel;
import com.hwq.lib_common.binding.command.BindingAction;
import com.hwq.lib_common.binding.command.BindingCommand;
import com.hwq.lib_common.http.BaseResponse;
import com.hwq.lib_common.http.ResponseThrowable;
import com.hwq.lib_common.http.utils.BaseObserver;
import com.hwq.lib_common.http.utils.RetrofitClient;
import com.hwq.lib_common.utils.KLog;
import com.hwq.lib_common.utils.RxUtils;
import com.hwq.mvvm.api.ApiService;
import com.hwq.mvvm.api.MovieSubscribe;
import com.hwq.mvvm.bean.DataBean;
import com.hwq.mvvm.bean.LoginModel;
import com.hwq.mvvm.bean.StrBean;
import com.trello.rxlifecycle2.LifecycleProvider;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.observers.DisposableObserver;

public class MainVM extends BaseViewModel {

    public ObservableInt visible = new ObservableInt(View.VISIBLE);


    public static String INDEX = "file:///android_asset/dist/index.html";
    public ObservableField<String> text = new ObservableField<>("测试");
    public ObservableField<String> url = new ObservableField<>(INDEX);
    public ObservableField<String> jsMethod = new ObservableField<>();
    public ObservableField<AndroidFun> funAndrodi = new ObservableField<>(new AndroidFun(getApplication()));

    public MainVM(@NonNull Application application) {
        super(application);
    }


    //登录按钮的点击事件
    public BindingCommand loginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
//            startActivity(Main2Activity.class);
//            finish();
//            requestNetWork();
            login();
//            js();

        }
    });

    //登录按钮的点击事件
    public BindingCommand loginOnClickCommand1 = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
//            startActivity(Main2Activity.class);
//            finish();
            requestNetWork();
//            login();
//            js();

        }
    });

    private void js() {
        jsMethod.set("javascript:_vue.getLoginInfo('" + "{\n" +
                "    \"msg\": \"成功\",\n" +
                "    \"data\": {\n" +
                "        \"token\": \"c2b14eb3-d01b-464b-8bad-9cd7a0db28e5\",  \n" +
                "        \"userinfo\": {     \n" +
                "            \"CSMZT\": 2,   \n" +
                "            \"IZT\": 1,     \n" +
                "            \"CDLFS  \": 3, \n" +
                "            \"INL\": 21,   \n" +
                "            \"CHZZY\": \"564324\",   \n" +
                "            \"CHZZYMC\": \"564324\", \n" +
                "            \"CSFZBM\": \"/file/fm.png\",  \n" +
                "            \"CHZTZ\": 43,  \n" +
                "            \"CHZJZD\": \"大成都\", \n" +
                "            \"CHZTX\": \"/file/dasdka.png\", \n" +
                "            \"DHZCJSJ\": \"2018-08-27 16: 46: 37\", \n" +
                "            \"CJKDABH\": \"健康档案编号\",  \n" +
                "            \"CSFZH\": \"513021198910121192\", \n" +
                "            \"DZHDL\": \"2018-09-20 10: 49: 15\", \n" +
                "            \"CHZXM\": \"认证姓名\",  \n" +
                "            \"CHZNC\": \"昵称\",  \n" +
                "            \"CXBMC\": \"男\", \n" +
                "            \"CXBBM\": \"1\", \n" +
                "            \"DCSNY\": \"1982-07-01 00: 00: 00\",\n" +
                "            \"CHZSJH\": \"18180898841\",\n" +
                "            \"CTNBLX\": \" 1型糖尿病\",\n" +
                "            \"CSFZZM\": \"/file/zm.png\",  \n" +
                "            \"CHZBM\": \"1\",           \n" +
                "            \"CSCSFZ\": \"/file/sc.png\",\n" +
                "            \"CHMDYY\": \"1\",  \n" +
                "            \"CHZSG\": 151,  \n" +
                "            \"DHZXGSJ\": \"2018-09-12 13: 48: 41\", \n" +
                "            \"CQYBRBH\": \"CQYBRBH\" \n" +
                "        },\n" +
                "        \"status\": \"1\" \n" +
                "    },\n" +
                "    \"code\": \"200\"\n" +
                "}\n" + "')");
    }

    public void login() {
        Map<String,String>parms = new HashMap<>();
        parms.put("MSH.1", "user");
        parms.put("MSH.2", "passwordLogin");
        parms.put("tel", "");
        parms.put("password", "");
        MovieSubscribe.login(parms, new BaseObserver<BaseResponse<DataBean>>() {
//            @Override
//            public void onNext(BaseResponse<DataBean> stringBaseResponse) {
//                super.onNext(stringBaseResponse);
//            }
            @Override
            public void onError(ResponseThrowable e) {
                KLog.e(e.message);
            }

            @Override
            public void onResult(BaseResponse<DataBean> stringBaseResponse) {
                text.set(stringBaseResponse.getResult().toString());
                KLog.e(stringBaseResponse.getResult().toString());
            }
        });
    }


    @Override
    public void onCreate() {
        super.onCreate();
//        requestNetWork();
    }



    void requestNetWork() {

        /**
         * 请求一
         */
        MovieSubscribe.getLogin("17688831088", "Aa1234", new BaseObserver<BaseResponse<LoginModel>>() {

//            @Override
//            public void onStart() {
//                super.onStart();
//            }

//            @Override
//            public void onNext(BaseResponse<LoginModel> loginModelBaseResponse) {
//                super.onNext(loginModelBaseResponse);
//            }
//            @Override
//            public void onComplete() {
//
//            }

            @Override
            public void onError(ResponseThrowable e) {
                text.set(e.getMessage()+e.message);
            }
            @Override
            public void onResult(BaseResponse<LoginModel> loginModelBaseResponse) {
                text.set(loginModelBaseResponse.getMessage()+loginModelBaseResponse.getCode());
            }
        });
//        MovieSubscribe.getText(new DisposableObserver<BaseResponse<StrBean>>() {
//            @Override
//            public void onNext(BaseResponse<StrBean> response) {
//                text.set(response.getResult().toString());
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                KLog.e("accept:onComplete"+e.getMessage());
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });
//
//        /**
//         * 请求二
//         */
        Map<String, String> map = new HashMap<>();
        map.put("phone", "17688831088");
        map.put("psd", "Aa1234");
        RetrofitClient.builder()
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

                        Log.e("aaa", "accept: "+throwable );

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
//                        text.set(response.getResult().toString());
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

    @Override
    public void onAny(LifecycleOwner owner, Lifecycle.Event event) {
        super.onAny(owner, event);
        KLog.e("onAny");



    }

    @Override
    public void injectLifecycleProvider(LifecycleProvider lifecycle) {
        super.injectLifecycleProvider(lifecycle);

    }
}
