package com.hwq.mvvm.openfile;

import android.os.Bundle;

import com.hwq.lib_common.base.BaseActivity;
import com.hwq.mvvm.R;
import com.hwq.mvvm.BR;
import com.hwq.mvvm.databinding.FragmentFileListBinding;


public class FileListActivity extends BaseActivity<FragmentFileListBinding,FileListModel> {


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.fragment_file_list;
    }

    @Override
    public int initVariableId() {

        return BR.filesVM;
    }


}
