package com.hwq.lib_common.wxapi.api;

import com.hwq.lib_common.http.utils.RetrofitClient;
import com.hwq.lib_common.wxapi.entity.WxInfoBean;
import com.hwq.lib_common.wxapi.entity.WxTokenBean;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;

public class WxSubscribe {
    static String url = "https://api.weixin.qq.com";
    /**
     * 获取微信token
     * @param prams 参数
     * @param observable 解析回掉
     */
    public static void getToken(Map<String,String>prams,Observer<WxTokenBean> observable){
        Observable<WxTokenBean>wxTokenBeanObservable = RetrofitClient.builder().setIsOtherUrl(true).setOtherUrl(url).apply().create(WxService.class).getToken(prams);
        RetrofitClient.builder().execute(wxTokenBeanObservable,observable);
    }

    /**
     * 获取登陆信息
     * @param prams 参数
     * @param observable 解析
     */
    public static void getInforMation(Map<String,String>prams,Observer<WxInfoBean> observable){
        Observable<WxInfoBean>wxTokenBeanObservable = RetrofitClient.builder().setIsOtherUrl(true).setOtherUrl(url).apply().create(WxService.class).getInformation(prams);
        RetrofitClient.builder().execute(wxTokenBeanObservable,observable);
    }
}
