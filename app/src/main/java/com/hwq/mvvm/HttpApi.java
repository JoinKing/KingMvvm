package com.hwq.mvvm;



import com.hwq.lib_common.http.BaseResponse;
import com.hwq.mvvm.bean.LoginModel;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * Created by 眼神 on 2018/3/27.
 *
 * 存放所有的Api
 */

public interface HttpApi {
    @POST("/user/login")
    Observable<BaseResponse<LoginModel>> getLogin(@QueryMap Map<String, String> map);

    @POST("/user/text")
    Observable<String> getText();

}
