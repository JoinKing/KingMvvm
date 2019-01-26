package com.hwq.mvvm.openfile.uploading;

import com.hwq.lib_common.http.BaseResponse;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.QueryMap;

public  interface Api {

    @Multipart
    @POST("CDCT_RCH_CI/commonFileUpload")  //这里是自己post文件的地址
    Observable<BaseResponse> postGoodsReturnPostEntitys(@QueryMap Map<String, String> map, @Part List<MultipartBody.Part> parts);

}
