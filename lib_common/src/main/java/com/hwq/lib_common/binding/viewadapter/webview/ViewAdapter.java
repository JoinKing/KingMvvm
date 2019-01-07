package com.hwq.lib_common.binding.viewadapter.webview;

import android.databinding.BindingAdapter;
import android.text.TextUtils;

import com.hwq.lib_common.utils.WebViewOption;
import com.tencent.smtt.sdk.WebView;

/**
 * Created by king on 2018.12.21
 */
public class ViewAdapter {
    @BindingAdapter({"render"})
    public static void loadHtml(WebView webView, final String html) {
        if (!TextUtils.isEmpty(html)) {
            webView.loadDataWithBaseURL(null, html, "text/html", "UTF-8", null);
        }
    }

    @BindingAdapter({"load_url"})
    public static void loadUrl(WebView webView, final String url) {
        if (!TextUtils.isEmpty(url)) {
            WebViewOption.setOption(webView,url);
        }
    }
}
