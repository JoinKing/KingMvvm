package com.hwq.mvvm.openfile.vm;

import android.app.Activity;
import android.app.Application;
import android.databinding.ObservableArrayList;
import android.support.annotation.NonNull;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.hwq.lib_common.base.BaseViewModel;
import com.hwq.lib_common.bus.RxBus;
import com.hwq.lib_common.bus.RxSubscriptions;
import com.hwq.lib_common.bus.event.EventShowProgress;
import com.hwq.lib_common.http.BaseResponse;
import com.hwq.lib_common.http.ResponseThrowable;
import com.hwq.lib_common.http.utils.BaseObserver;
import com.hwq.lib_common.utils.KLog;
import com.hwq.lib_common.utils.ToastUtils;
import com.hwq.lib_common.utils.Utils;
import com.hwq.lib_common.utils.searchfile.MimeUtils;
import com.hwq.lib_common.widget.dialog.AppProgressDialog;
import com.hwq.mvvm.openfile.adapter.FileListAdapter;
import com.hwq.mvvm.openfile.entity.FileEntity;

import com.hwq.mvvm.openfile.uploading.UploadSubscribe;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class FileListModel extends BaseViewModel {
    public FileListAdapter adapter = new FileListAdapter();

    private AppProgressDialog dialog;

    public FileListModel(@NonNull Application application) {
        super(application);
    }


    @Override
    public void onCreate() {
        super.onCreate();
        dialog = new AppProgressDialog((Activity) getLifecycleProvider());
        initData();
    }

    private ObservableArrayList<FileEntity> child;

    private void initData() {
        child = new ObservableArrayList<>();
        String[] gtoup = {"pdf", "doc", "xls", "text", "ppt", "pptx", "jpg","mp4"};
        for (int i = 0; i < gtoup.length; i++) {
            FileEntity entity = new FileEntity();
            entity.setFileType(MimeUtils.getMineType(gtoup[i]));
            entity.setTitle(gtoup[i]);
            entity.setChild(MimeUtils.searchTypeObservable(Utils.getContext(), gtoup[i]));
            child.add(entity);
        }
        adapter.setChild(child);


    }

    private Disposable disposable;


    @Override
    public void registerRxBus() {
        disposable = RxBus.getDefault().toObservable(EventShowProgress.class).subscribe(new Consumer<EventShowProgress>() {
            @Override
            public void accept(EventShowProgress rxBusEvent) throws Exception {
                HashMap<String, String> params = new HashMap<>();
                params.put("isNeedShow", "true");
                params.put("resourceType", "test");
                UploadSubscribe.upLoad(params, rxBusEvent.file, rxBusEvent.fileType, new BaseObserver<BaseResponse>() {
                    @Override
                    public void onStart() {
                        dialog.setMessage("正在上传中。。");
                        dialog.show();
                    }

                    @Override
                    public void onError(ResponseThrowable e) {
                        ToastUtils.showShort("上传失败" + e.message + "," + e.code);
                        dialog.dismiss();
                        KLog.e(e.message);
                    }

                    @Override
                    public void onResult(BaseResponse baseResponse) {
                        if (baseResponse.getCode() == 200) {
                            ToastUtils.showShort("上传成功");
                            dialog.dismiss();
                        }
                        KLog.e(baseResponse.getCode());

                    }
                });


            }
        });
        RxSubscriptions.add(disposable);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        RxSubscriptions.remove(disposable);

    }


}
