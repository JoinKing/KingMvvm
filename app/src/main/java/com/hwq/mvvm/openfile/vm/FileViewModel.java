package com.hwq.mvvm.openfile.vm;

import android.app.Application;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import com.hwq.lib_common.base.BaseViewModel;

public class FileViewModel extends BaseViewModel {


    public ObservableField<String> url = new ObservableField<>();

    public FileViewModel(@NonNull Application application) {
        super(application);
    }



}
