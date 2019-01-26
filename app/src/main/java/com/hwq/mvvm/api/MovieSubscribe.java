package com.hwq.mvvm.api;



import com.hwq.lib_common.http.BaseResponse;
import com.hwq.lib_common.http.utils.BaseObserver;
import com.hwq.lib_common.http.utils.RetrofitClient;
import com.hwq.mvvm.bean.DataBean;
import com.hwq.mvvm.bean.LoginModel;
import com.hwq.mvvm.bean.StrBean;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;

/**
 *
 * 建议：把功能模块来分别存放不同的请求方法
 */

public class MovieSubscribe {
    /**
     * 获取登陆信息
     */
    public static void getLogin(String phone,String psd,BaseObserver<BaseResponse<LoginModel>> observer){
        Map<String,String> map = new HashMap<>();
        map.put("phone",phone);
        map.put("psd",psd);
        Observable<BaseResponse<LoginModel>> observable = RetrofitClient.builder().apply().create(ApiService.class).getLogin(map);
        RetrofitClient.builder().toSubscribe(observable, observer);
    }

    /**
     * 测试时
     */

    public static void getText(BaseObserver<BaseResponse<StrBean>> observer){
        Observable<BaseResponse<StrBean>> observable =  RetrofitClient.builder().create(ApiService.class).getText();
        RetrofitClient.builder().toSubscribe(observable, observer);
    }


    public static void login(Map<String,String>prams,BaseObserver<BaseResponse<DataBean>>observer){
        Observable<BaseResponse<DataBean>>observable = RetrofitClient.builder().setIsOtherUrl(true).setOtherUrl("http://192.168.88.88:8888").apply().create(ApiService.class).login(prams);
        RetrofitClient.builder().toSubscribe(observable,observer);
    }








}
