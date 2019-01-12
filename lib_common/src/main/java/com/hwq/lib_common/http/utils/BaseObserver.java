package com.hwq.lib_common.http.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.hwq.lib_common.http.BaseResponse;
import com.hwq.lib_common.http.ExceptionHandle;
import com.hwq.lib_common.http.NetworkUtil;
import com.hwq.lib_common.http.ResponseThrowable;
import com.hwq.lib_common.utils.KLog;
import com.hwq.lib_common.utils.ToastUtils;
import com.hwq.lib_common.utils.Utils;

import io.reactivex.observers.DisposableObserver;

public abstract class BaseObserver<T> extends DisposableObserver<T> {

    @Override
    public void onNext(T t) {
        BaseResponse baseResponse = (BaseResponse) t;
        if (baseResponse.getCode() == 200) {
            onResult((T) baseResponse);
        }else {
            ToastUtils.showShort("错误信息："+baseResponse.getMessage()+ ",错误码："+baseResponse.getCode());
        }

    }




    @Override
    public void onError(Throwable e) {
        KLog.e(e.getMessage());
        // todo error somthing

        if (e instanceof ResponseThrowable) {
            onError((ResponseThrowable) e);
        } else {
            onError(new ResponseThrowable(e, ExceptionHandle.ERROR.UNKNOWN));
        }
    }


    @Override
    public void onStart() {
        super.onStart();
        // todo some common as show loadding  and check netWork is NetworkAvailable
        // if  NetworkAvailable no !   must to call onCompleted
        if (!NetworkUtil.isNetworkAvailable(Utils.getContext())) {
            Toast.makeText(Utils.getContext(), "无网络，读取缓存数据", Toast.LENGTH_SHORT).show();
            onComplete();
        }

    }

    @Override
    public void onComplete() {
//        Toast.makeText(context, "http is Complete", Toast.LENGTH_SHORT).show();
        // todo some common as  dismiss loadding
    }


    public abstract void onError(ResponseThrowable e);


    public abstract void onResult(T t);
}