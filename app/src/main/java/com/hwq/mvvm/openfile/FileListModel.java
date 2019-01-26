package com.hwq.mvvm.openfile;

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
import com.hwq.lib_common.widget.dialog.DonwLoadProgressBar;
import com.hwq.mvvm.openfile.adapter.FileListAdapter;
import com.hwq.mvvm.openfile.entity.FileEntity;

import com.hwq.mvvm.openfile.uploading.UploadSubscribe;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class FileListModel extends BaseViewModel implements DonwLoadProgressBar.Progress {
    public FileListAdapter adapter = new FileListAdapter();

    public FileListModel(@NonNull Application application) {
        super(application);
    }


    @Override
    public void onCreate() {
        super.onCreate();
        initData();
    }

    private ObservableArrayList<FileEntity> child;

    private void initData() {
        child = new ObservableArrayList<>();
        String[] gtoup = {"pdf", "doc", "xls", "text", "ppt", "pptx"};
        for (int i = 0; i < gtoup.length; i++) {
            FileEntity entity = new FileEntity();
            entity.setTitle(gtoup[i]);
            entity.setChild(MimeUtils.searchTypeObservable(Utils.getContext(), gtoup[i]));
            child.add(entity);
        }
        adapter.setChild(child);

        progressBar = new DonwLoadProgressBar((Activity)getLifecycleProvider());
        progressBar.setProgress(this);
    }

    private Disposable disposable;
    private DonwLoadProgressBar progressBar;

    @Override
    public void registerRxBus() {
        disposable = RxBus.getDefault().toObservable(EventShowProgress.class).subscribe(new Consumer<EventShowProgress>() {
            @Override
            public void accept(EventShowProgress rxBusEvent) throws Exception {
                HashMap<String, String> params = new HashMap<>();
                List<File> listFile =new ArrayList<>();
                params.put("isNeedShow", "false");
                params.put("resourceType", "test");
                listFile.add(rxBusEvent.file);
                UploadSubscribe.upLoading(params, listFile, rxBusEvent.fileType, new BaseObserver<BaseResponse>() {
                    @Override
                    public void onError(ResponseThrowable e) {

                        KLog.e(e.message);

                    }

                    @Override
                    public void onResult(BaseResponse baseResponse) {
                        KLog.e(baseResponse.getCode());

                    }
                });


                ToastUtils.showShort("xxxx");
                progressBar.show();
            }
        });
        RxSubscriptions.add(disposable);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        RxSubscriptions.remove(disposable);

    }

    @Override
    public void progressCallback(ProgressBar pb, TextView textView) {

    }


}
