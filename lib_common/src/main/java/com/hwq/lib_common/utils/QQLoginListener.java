package com.hwq.lib_common.utils;

import android.app.Activity;

import com.tencent.connect.UserInfo;
import com.tencent.connect.auth.QQToken;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;

import org.json.JSONObject;

import java.lang.ref.WeakReference;

public class QQLoginListener implements IUiListener {

    private WeakReference<Activity> activityWeakReference;

    public QQLoginListener(Activity activity) {
        this.activityWeakReference = new WeakReference<>(activity);
    }

    @Override
    public void onComplete(Object object) {
        //获取openid和token
        initOpenIdAndToken(object);
        //获取用户信息
        getUserInfo();

    }

    @Override
    public void onError(UiError uiError) {

    }

    @Override
    public void onCancel() {

    }

    public void initOpenIdAndToken(Object object) {
        JSONObject jb = (JSONObject) object;
        try {
            String openID = jb.optString("openid");  //openid用户唯一标识
//            activityWeakReference.get().setQQLogin(openID);
            String access_token = jb.optString("access_token");
            String expires = jb.optString("expires_in");
//            activityWeakReference.get().mTencent.setOpenId(openID);
//            activityWeakReference.get().mTencent.setAccessToken(access_token, expires);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    UserInfo mInfo;
    private void getUserInfo() {
//        QQToken token = activityWeakReference.get().mTencent.getQQToken();
//        mInfo = new UserInfo(activityWeakReference.get(), token);
        mInfo.getUserInfo(new IUiListener() {
            @Override
            public void onComplete(Object object) {
                JSONObject jb = (JSONObject) object;
                try {
                    String name = jb.getString("nickname");
                    String figureurl = jb.getString("figureurl_qq_2");  //头像图片的url
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(UiError uiError) {

            }

            @Override
            public void onCancel() {

            }
        });
    }
}
