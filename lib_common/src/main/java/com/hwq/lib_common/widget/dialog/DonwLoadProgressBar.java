package com.hwq.lib_common.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.hwq.lib_common.R;

public class DonwLoadProgressBar extends Dialog {
    ProgressBar pb;
    TextView tvProgress;
    View view;
    public DonwLoadProgressBar(@NonNull Context context) {
        super(context,R.style.bottom_dialog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = LayoutInflater.from(getContext()).inflate(R.layout.dialog_donwload,null);
        setContentView(view);
        initView();
    }

    private void initView() {
        tvProgress = view.findViewById(R.id.tvProgress);
        pb = view.findViewById(R.id.pb);
        pb.setMax(100);
    }


    private Progress progress;

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    public interface Progress{
        void progressCallback(ProgressBar pb,TextView textView);
    }

    @Override
    public void show() {
        if (progress!=null){
            progress.progressCallback(pb,tvProgress);
        }
    }
}
