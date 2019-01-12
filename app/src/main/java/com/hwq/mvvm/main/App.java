package com.hwq.mvvm.main;

import android.content.Context;

import com.hwq.lib_common.BuildConfig;
import com.hwq.lib_common.base.BaseApplication;
import com.hwq.lib_common.crash.CaocConfig;
import com.hwq.lib_common.http.utils.RetrofitClient;
import com.hwq.lib_common.utils.KLog;
import com.hwq.mvvm.MainActivity;
import com.hwq.mvvm.R;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import java.util.HashMap;
import java.util.Map;

public class App extends BaseApplication {
    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        //开启打印日志
        KLog.init(true);
        //初始化全局异常崩溃
        initCrash();
        //内存泄漏检测
        if (!LeakCanary.isInAnalyzerProcess(this)) {
            refWatcher = LeakCanary.install(this);
        }
        Map<String, String> headers = new HashMap<>();
        headers.put("user-agent", "Android");
        headers.put("Content-Type", "application/json");

        //配置网络请求
        RetrofitClient.builder()
//                .setWxAppid()//微信appid
//                .setWxSerecet()//微信Serecet
//                .setQQAppid()//QQAppid
//                .setQQSerecet()//QQSerecet
                .setUrl("http://192.168.200.77:8080")
//                .setUrl("http://47.105.149.12:9090")
                .setHeaders(headers)
                .apply();

        api = WXAPIFactory.createWXAPI(this, RetrofitClient.APP_ID, true);
        api.registerApp(RetrofitClient.APP_ID);


    }


    private void initCrash() {
        CaocConfig.Builder.create()
                .backgroundMode(CaocConfig.BACKGROUND_MODE_SILENT) //背景模式,开启沉浸式
                .enabled(true) //是否启动全局异常捕获
                .showErrorDetails(true) //是否显示错误详细信息
                .showRestartButton(true) //是否显示重启按钮
                .trackActivities(true) //是否跟踪Activity
                .minTimeBetweenCrashesMs(2000) //崩溃的间隔时间(毫秒)
                .errorDrawable(R.mipmap.ic_launcher) //错误图标
                .restartActivity(MainActivity.class) //重新启动后的activity
//                .errorActivity(YourCustomErrorActivity.class) //崩溃后的错误activity
//                .eventListener(new YourCustomEventListener()) //崩溃后的错误监听
                .apply();
    }
}
