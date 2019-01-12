package com.hwq.lib_common.wxapi.api;

import com.hwq.lib_common.wxapi.entity.WxInfoBean;
import com.hwq.lib_common.wxapi.entity.WxTokenBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface WxService {

    @GET("/sns/oauth2/access_token")
    Observable<WxTokenBean> getToken(@QueryMap Map<String, String> map);
    @GET("/sns/userinfo")
    Observable<WxInfoBean> getInformation(@QueryMap Map<String, String> map);
}
