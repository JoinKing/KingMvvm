package com.hwq.mvvm.api;


import com.hwq.lib_common.http.BaseResponse;
import com.hwq.mvvm.bean.LoginModel;
import com.hwq.mvvm.bean.StrBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface ApiService {

    @POST("/user/login")
    Observable<BaseResponse<LoginModel>> getLogin(@QueryMap Map<String, String> map);

    @GET("/user/text")
    Observable<BaseResponse<StrBean>> getText();
}
