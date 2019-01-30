package com.hwq.mvvm.openfile;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;

import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.hwq.lib_common.base.BaseFragment;
import com.hwq.lib_common.utils.KLog;
import com.hwq.mvvm.R;
import com.hwq.mvvm.BR;
import com.hwq.mvvm.databinding.FragmentFileBinding;
import com.hwq.mvvm.openfile.vm.FileViewModel;
import com.tencent.smtt.sdk.TbsReaderView;


public class FileFragment extends BaseFragment<FragmentFileBinding,FileViewModel> implements TbsReaderView.ReaderCallback {

    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_file;
    }

    @Override
    public int initVariableId() {
        return BR.fileVM;
    }

    TbsReaderView tbsReaderView;


    @Override
    public void initData() {
        tbsReaderView = new TbsReaderView(getActivity(),this);
        binding.tbRelay.addView(tbsReaderView,new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
        Bundle bundle = getArguments();
        if (null!=bundle){
            boolean result = tbsReaderView.preOpen(parseFormat(bundle.getString("filePath")), false);
            if (result){
                tbsReaderView.openFile(bundle);
            }
        }
        KLog.e("xxxxx"+bundle.getString("filePath"));
        KLog.e("xxxxx"+bundle.getString("tempPath"));
    }


    private String parseFormat(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        tbsReaderView.onStop();
    }

    @Override
    public void onStop() {
        super.onStop();
        tbsReaderView.onStop();
    }

    @Override
    public void onCallBackAction(Integer integer, Object o, Object o1) {

    }
}
