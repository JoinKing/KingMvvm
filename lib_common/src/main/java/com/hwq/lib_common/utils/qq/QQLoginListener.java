package com.hwq.lib_common.utils.qq;

import com.hwq.lib_common.bus.RxBus;
import com.tencent.connect.UserInfo;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;

import org.json.JSONObject;


public class QQLoginListener implements IUiListener {


    public QQLoginListener() {
    }

    @Override
    public void onComplete(Object object) {
        //获取openid和token
        initOpenIdAndToken(object);

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
            String access_token = jb.optString("access_token");
            String expires = jb.optString("expires_in");

            QQEntity entity = new QQEntity();
            entity.setOpenID(openID);
            entity.setAccess_token(access_token);
            entity.setExpires(expires);
            /**
             * 使用rxbus去接收信息
             */
            RxBus.getDefault().post(entity);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 备注：获取用户信息 单独在需要使用的地方进行访问
     *
     * private void getUserInfo() {
     *
     *         QQToken token = activityWeakReference.get().mTencent.getQQToken();
     *         UserInfo mInfo = new UserInfo(activityWeakReference.get(), token);
     *         mInfo.getUserInfo(new IUiListener() {
     *             @Override
     *             public void onComplete(Object object) {
     *                 JSONObject jb = (JSONObject) object;
     *                 try {
     *                     String name = jb.getString("nickname");
     *                     String figureurl = jb.getString("figureurl_qq_2");  //头像图片的url
     *
     *                 } catch (Exception e) {
     *                     e.printStackTrace();
     *                 }
     *             }
     *
     *             @Override
     *             public void onError(UiError uiError) {
     *
     *             }
     *
     *             @Override
     *             public void onCancel() {
     *
     *             }
     *         });
     *     }
     */



}
