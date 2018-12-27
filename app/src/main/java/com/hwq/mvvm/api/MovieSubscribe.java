package com.hwq.mvvm.api;



import com.hwq.lib_common.http.BaseResponse;
import com.hwq.lib_common.http.utils.RetrofitClient;
import com.hwq.mvvm.api.ApiService;
import com.hwq.mvvm.bean.LoginModel;
import com.hwq.mvvm.bean.StrBean;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.observers.DisposableObserver;

/**
 * Created by 眼神 on 2018/3/27.
 * 建议：把功能模块来分别存放不同的请求方法，比如登录注册类LoginSubscribe、电影类MovieSubscribe
 */

public class MovieSubscribe {
    /**
     * 获取登陆信息
     */
    public static void getLogin(String phone,String psd,DisposableObserver<BaseResponse<LoginModel>> observer){
        Map<String,String> map = new HashMap<>();
        map.put("phone",phone);
        map.put("psd",psd);
        Observable<BaseResponse<LoginModel>> observable = RetrofitClient.getInstance().create(ApiService.class).getLogin(map);
        RetrofitClient.getInstance().toSubscribe(observable, observer);

    }

    /**
     * 测试时
     */

    public static void getText(DisposableObserver<BaseResponse<StrBean>> observer){
        Observable<BaseResponse<StrBean>> observable =  RetrofitClient.getInstance().create(ApiService.class).getText();
        RetrofitClient.getInstance().toSubscribe(observable, observer);
    }


}
