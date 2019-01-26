package com.hwq.lib_common.binding.adapter.itembindings;


import com.hwq.lib_common.binding.adapter.ItemBinding;

public interface ItemBindingModel {
    /**
     * Set the binding variable and layout of the given view.
     * <pre>{@code
     * onItemBind.set(BR.item, R.layout.item);
     * }</pre>
     */
    void onItemBind(ItemBinding itemBinding);
}