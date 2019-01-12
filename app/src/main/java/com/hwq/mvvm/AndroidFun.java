package com.hwq.mvvm;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;


import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author king
 * @tome 2018.8.21
 * @JsMutual js交互页面
 * @JavascriptInterface 注解标记的方法
 */
public class AndroidFun {
    private Context context;
    private JsMutualIMPL mutualIMPL;

    public AndroidFun(Context context) {
        this.context = context;
    }

    @JavascriptInterface
    public void mutual(String type) {
        Log.e("TAG", "mutual: "+type );
    }

    @JavascriptInterface
    public void mutualLog(String info){
        Log.e("TAG", "mutualLog: "+info );
    }


    public void setMutualIMPL(JsMutualIMPL mutualIMPL) {
        this.mutualIMPL = mutualIMPL;
    }

    public interface JsMutualIMPL {
        void CallBack(String type, String data);
    }
}


