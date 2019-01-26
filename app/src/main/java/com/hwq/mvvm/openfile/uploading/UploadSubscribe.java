package com.hwq.mvvm.openfile.uploading;

import com.hwq.lib_common.http.BaseResponse;
import com.hwq.lib_common.http.utils.BaseObserver;
import com.hwq.lib_common.http.utils.RetrofitClient;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class UploadSubscribe {

    public static void upLoading(Map<String, String> params,List<File> fileList ,String fileType,BaseObserver<BaseResponse> observer){

        Map<String, RequestBody> params1 = new HashMap<>();
        params1.put("resourceType",convertToRequestBody(params.get("resourceType")));
        params1.put("isNeedShow",convertToRequestBody(params.get("isNeedShow")));

        List<MultipartBody.Part> partList = filesToMultipartBodyParts(fileList,fileType);
        Observable<BaseResponse> observable  =   RetrofitClient.builder()
                .setIsOtherUrl(true)
                .setOtherUrl("http://192.168.200.77:8080")
                .apply()
                .create(Api.class)
                .postGoodsReturnPostEntitys(params,partList);
        RetrofitClient.builder().toSubscribe(observable, observer);
    }

    private static RequestBody convertToRequestBody(String param){
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain"), param);
        return requestBody;
    }

    /**
     *
     * @param files
     * @param fileType image/png 文件格式类型
     * @return
     */
    private static List<MultipartBody.Part> filesToMultipartBodyParts(List<File> files,String fileType) {
        List<MultipartBody.Part> parts = new ArrayList<>(files.size());
        for (File file : files) {
            RequestBody requestBody = RequestBody.create(MediaType.parse(fileType), file);
            MultipartBody.Part part = MultipartBody.Part.createFormData("multipartFiles", file.getName(), requestBody);
            parts.add(part);
        }
        return parts;
    }

}
