package com.hwq.lib_common.binding.command;

/**
 *
 * Created by king on 2019.1.11
 * @param <T> the result type
 */
public interface BindingFunction<T> {
    T call();
}
