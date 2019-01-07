package com.hwq.lib_common.widget.refreshlayout.utils;

import android.util.Log;

/**
 * Created by king on 2019/1/7.
 */

public class LogUtil {
    private static final boolean DEBUG = false;

    public static void i(String msg) {
        if (!DEBUG) return;
        Log.i("TwinklingRefreshLayout", msg);
    }
}
