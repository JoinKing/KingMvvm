package com.hwq.mvvm.api;


import com.hwq.lib_common.http.BaseResponse;
import com.hwq.mvvm.bean.LoginModel;
import com.hwq.mvvm.bean.StrBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

    @POST("/user/login")
    @FormUrlEncoded
    Observable<BaseResponse<LoginModel>> demoPost(@Field("phone") String phone, @Field("psd") String psd);

    @GET("/user/text")
    Observable<BaseResponse<StrBean>> getText();
}
