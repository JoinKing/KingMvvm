package com.hwq.lib_common.base;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

public class BaseBindViewHolder extends RecyclerView.ViewHolder {
    ViewDataBinding mDataBinding;
    public BaseBindViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        mDataBinding=binding;
    }

    public ViewDataBinding getBinding() {
        return mDataBinding;
    }
}
