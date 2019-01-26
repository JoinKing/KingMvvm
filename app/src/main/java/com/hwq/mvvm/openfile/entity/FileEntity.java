package com.hwq.mvvm.openfile.entity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableArrayList;

import com.hwq.lib_common.binding.command.BindingAction;
import com.hwq.lib_common.binding.command.BindingCommand;
import com.hwq.lib_common.utils.searchfile.FileBean;

import java.util.List;

public class FileEntity extends BaseObservable {
    private String title;
    private ObservableArrayList<FileBean> child;

    public BindingCommand groupOnclick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
//            child = new ObservableArrayList<>();
//            child.addAll(MimeUtils.searchType(Utils.getContext(),title));
//            KLog.e(child.toString());
        }
    });

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<FileBean> getChild() {
        return child;
    }

    public void setChild(ObservableArrayList<FileBean> child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "FileEntity{" +
                "title='" + title + '\'' +
                ", child=" + child +
                '}';
    }
}
