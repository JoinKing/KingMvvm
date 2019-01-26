package com.hwq.lib_common.utils.searchfile;

import android.content.Intent;
import android.databinding.Bindable;
import android.databinding.Observable;
import android.os.Bundle;
import android.os.Environment;

import com.hwq.lib_common.base.ContainerActivity;
import com.hwq.lib_common.binding.command.BindingAction;
import com.hwq.lib_common.binding.command.BindingCommand;
import com.hwq.lib_common.bus.RxBus;
import com.hwq.lib_common.bus.event.EventShowProgress;
import com.hwq.lib_common.utils.Utils;

import java.io.File;

/**
 *
 *  Created by king on 2019.1.17
 */
public class FileBean implements Observable {
    private String name;
    private long size;
    private String path;
    public BindingCommand childOnclick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            Bundle bundle = new Bundle();
            bundle.putString("filePath",path);
            bundle.putString("tempPath",Environment.getExternalStorageDirectory().getPath());
            Intent intent = new Intent(Utils.getContext(), ContainerActivity.class);
            intent.putExtra(ContainerActivity.FRAGMENT, "com.hwq.mvvm.openfile.FileFragment");
            if (bundle != null) {
                intent.putExtra(ContainerActivity.BUNDLE, bundle);
            }
            Utils.getContext().startActivity(intent);

        }
    });

    public BindingCommand longOnclick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            EventShowProgress progress = new EventShowProgress();
            progress.fileType = "pdf";
            progress.file = new File(path);
            RxBus.getDefault().post(progress);
        }
    });

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Bindable
    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
    @Bindable
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "FileBean{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }
}
