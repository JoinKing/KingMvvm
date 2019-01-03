package com.hwq.lib_common.utils;

import android.app.Activity;
import android.os.Bundle;

import com.tencent.connect.share.QQShare;
import com.tencent.connect.share.QzoneShare;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;

import java.util.ArrayList;

public class QQShareUtils {
    /**
     * （2） 分享纯图片
     * QQShare.SHARE_TO_QQ_KEY_TYPE    必选 Int    分享类型，分享纯图片时填写QQShare.SHARE_TO_QQ_TYPE_IMAGE。
     * QQShare.SHARE_TO_QQ_IMAGE_LOCAL_URL 必选 String 需要分享的本地图片路径。
     * QQShare.SHARE_TO_QQ_APP_NAME    可选 String 手Q客户端顶部，替换“返回”按钮文字，如果为空，用返回代替。
     * QQShare.SHARE_TO_QQ_EXT_INT 可选 Int    分享额外选项，两种类型可选（默认是不隐藏分享到QZone按钮且不自动打开分享到QZone的对话框）：
     * QQShare.SHARE_TO_QQ_FLAG_QZONE_AUTO_OPEN，分享时自动打开分享到QZone的对话框。
     * QQShare.SHARE_TO_QQ_FLAG_QZONE_ITEM_HIDE，分享时隐藏分享到QZone按钮。
     */
    public static  void onClickShare(Tencent mTencent, Activity activity, IUiListener listener) {
        Bundle params = new Bundle();
//        params.putString(QQShare.SHARE_TO_QQ_IMAGE_LOCAL_URL,imageUrl.getText().toString());
//        params.putString(QQShare.SHARE_TO_QQ_APP_NAME, appName.getText().toString());
        params.putInt(QQShare.SHARE_TO_QQ_KEY_TYPE, QQShare.SHARE_TO_QQ_TYPE_IMAGE);
        params.putInt(QQShare.SHARE_TO_QQ_EXT_INT, QQShare.SHARE_TO_QQ_FLAG_QZONE_AUTO_OPEN);
        mTencent.shareToQQ(activity, params, listener);
    }
    /**
     * （3） 分享音乐
     * QQShare.SHARE_TO_QQ_KEY_TYPE    必填 Int    分享的类型。分享音乐填Tencent.SHARE_TO_QQ_TYPE_AUDIO。
     * QQShare.PARAM_TARGET_URL    必选 String 这条分享消息被好友点击后的跳转URL。
     * QQShare.SHARE_TO_QQ_AUDIO_URL   必填 String 音乐文件的远程链接, 以URL的形式传入, 不支持本地音乐。
     * QQShare.PARAM_TITLE 必选 String 分享的标题, 最长30个字符。
     * QQShare.PARAM_SUMMARY   可选 String 分享的消息摘要，最长40个字符。
     * QQShare.SHARE_TO_QQ_IMAGE_URL   可选 String 分享图片的URL或者本地路径。
     * QQShare.SHARE_TO_QQ_APP_NAME    可选 String 手Q客户端顶部，替换“返回”按钮文字，如果为空，用返回代替。
     * QQShare.SHARE_TO_QQ_EXT_INT 可选 Int    分享额外选项，两种类型可选（默认是不隐藏分享到QZone按钮且不自动打开分享到QZone的对话框）：
     * QQShare.SHARE_TO_QQ_FLAG_QZONE_AUTO_OPEN，分享时自动打开分享到QZone的对话框。
     * QQShare.SHARE_TO_QQ_FLAG_QZONE_ITEM_HIDE，分享时隐藏分享到QZone按钮。
     */
    public static  void onClickAudioShareImage(Tencent mTencent, Activity activity, IUiListener listener) {
        final Bundle params = new Bundle();
        params.putInt(QQShare.SHARE_TO_QQ_KEY_TYPE, QQShare.SHARE_TO_QQ_TYPE_AUDIO);
        params.putString(QQShare.SHARE_TO_QQ_TITLE, "要分享的标题");
        params.putString(QQShare.SHARE_TO_QQ_SUMMARY,  "要分享的摘要");
        params.putString(QQShare.SHARE_TO_QQ_TARGET_URL,  "http://www.baidu.com");
        params.putString(QQShare.SHARE_TO_QQ_IMAGE_URL, "http://gaopin-img.bj.bcebos.com/chinacity.jpg");
        params.putString(QQShare.SHARE_TO_QQ_AUDIO_URL, "音乐链接");
        params.putString(QQShare.SHARE_TO_QQ_APP_NAME,  "测试应用222222");
        params.putInt(QQShare.SHARE_TO_QQ_EXT_INT, QQShare.SHARE_TO_QQ_FLAG_QZONE_AUTO_OPEN);
        mTencent.shareToQQ(activity, params, listener);
    }
    /**
     * （4） 分享应用
     * QQShare.SHARE_TO_QQ_KEY_TYPE    必填 Int    分享的类型。分享音乐填Tencent.SHARE_TO_QQ_TYPE_PP。
     * QQShare.PARAM_TITLE 必选 String 分享的标题, 最长30个字符。
     * QQShare.PARAM_SUMMARY   可选 String 分享的消息摘要，最长40个字符。
     * QQShare.SHARE_TO_QQ_IMAGE_URL   可选 String 分享图片的URL或者本地路径。
     * QQShare.SHARE_TO_QQ_APP_NAME    可选 String 手Q客户端顶部，替换“返回”按钮文字，如果为空，用返回代替。
     * QQShare.SHARE_TO_QQ_EXT_INT 可选 Int    分享额外选项，两种类型可选（默认是不隐藏分享到QZone按钮且不自动打开分享到QZone的对话框）：
     * QQShare.SHARE_TO_QQ_FLAG_QZONE_AUTO_OPEN，分享时自动打开分享到QZone的对话框。
     * QQShare.SHARE_TO_QQ_FLAG_QZONE_ITEM_HIDE，分享时隐藏分享到QZone按钮。
     */
    public static  void onClickAppShare(Tencent mTencent, Activity activity, IUiListener listener) {
        final Bundle params = new Bundle();
        params.putInt(QQShare.SHARE_TO_QQ_KEY_TYPE, QQShare.SHARE_TO_QQ_TYPE_APP);
        params.putString(QQShare.SHARE_TO_QQ_TITLE, "要分享的标题");
        params.putString(QQShare.SHARE_TO_QQ_SUMMARY,  "要分享的摘要");
        params.putString(QQShare.SHARE_TO_QQ_IMAGE_URL, "http://gaopin-img.bj.bcebos.com/chinacity.jpg");
        params.putString(QQShare.SHARE_TO_QQ_APP_NAME,  "测试应用");
        mTencent.shareToQQ(activity, params, listener);
    }

    /**
     *  1） 分享图文消息
     * QQShare.SHARE_TO_QQ_KEY_TYPE    必填 Int    分享的类型。图文分享(普通分享)填Tencent.SHARE_TO_QQ_TYPE_DEFAULT
     * QQShare.PARAM_TARGET_URL    必填 String 这条分享消息被好友点击后的跳转URL。
     * QQShare.PARAM_TITLE 必填 String 分享的标题, 最长30个字符。
     * QQShare.PARAM_SUMMARY   可选 String 分享的消息摘要，最长40个字。
     * QQShare.SHARE_TO_QQ_IMAGE_URL   可选 String 分享图片的URL或者本地路径
     * QQShare.SHARE_TO_QQ_APP_NAME    可选 String 手Q客户端顶部，替换“返回”按钮文字，如果为空，用返回代替
     * QQShare.SHARE_TO_QQ_EXT_INT 可选 Int    分享额外选项，两种类型可选（默认是不隐藏分享到QZone按钮且不自动打开分享到QZone的对话框）：
     * QQShare.SHARE_TO_QQ_FLAG_QZONE_AUTO_OPEN，分享时自动打开分享到QZone的对话框。
     * QQShare.SHARE_TO_QQ_FLAG_QZONE_ITEM_HIDE，分享时隐藏分享到QZone按钮
     */
    public static void shareToQQ(Tencent mTencent, Activity activity, IUiListener listener, String title, String content, String url) {
        Bundle params = new Bundle();
        params.putInt(QQShare.SHARE_TO_QQ_KEY_TYPE, QQShare.SHARE_TO_QQ_TYPE_DEFAULT);
        params.putString(QQShare.SHARE_TO_QQ_TITLE, title);// 标题
        params.putString(QQShare.SHARE_TO_QQ_SUMMARY, content);// 摘要
        params.putString(QQShare.SHARE_TO_QQ_TARGET_URL,url);// 内容地址
//        params.putString(QQShare.SHARE_TO_QQ_IMAGE_URL,"http://gaopin-img.bj.bcebos.com/chinacity.jpg");// 网络图片地址　　params.putString(QQShare.SHARE_TO_QQ_APP_NAME, "应用名称");// 应用名称
        params.putString(QQShare.SHARE_TO_QQ_EXT_INT, "其它附加功能");
        // 分享操作要在主线程中完成
        mTencent.shareToQQ(activity, params, listener);
    }
    /**
     * 1.14 分享到QQ空间
     * QzoneShare.SHARE_TO_QZONE_KEY_TYPE  选填 Int    SHARE_TO_QZONE_TYPE_IMAGE_TEXT（图文）
     * QzoneShare.SHARE_TO_QQ_TITLE    必填    分享的标题，最多200个字符。
     * QzoneShare.SHARE_TO_QQ_SUMMARY  选填 String 分享的摘要，最多600字符。
     * QzoneShare.SHARE_TO_QQ_TARGET_URL   必填 String 需要跳转的链接，URL字符串。
     * QzoneShare.SHARE_TO_QQ_IMAGE_URL    选填 String 分享的图片, 以ArrayList<String>的类型传入，以便支持多张图片（注：图片最多支持9张图片，多余的图片会被丢弃）
     */
    public static void shareToQZone(Tencent mTencent, Activity activity, IUiListener listener, String title, String content, String url) {
        Bundle params = new Bundle();
        params.putInt(QzoneShare.SHARE_TO_QZONE_KEY_TYPE, QzoneShare.SHARE_TO_QZONE_TYPE_IMAGE_TEXT);
        params.putString(QzoneShare.SHARE_TO_QQ_TITLE, title);// 标题
        params.putString(QzoneShare.SHARE_TO_QQ_SUMMARY, content);// 摘要
        params.putString(QzoneShare.SHARE_TO_QQ_TARGET_URL,url);// 内容地址
        ArrayList<String> imgUrlList = new ArrayList<>();
//        imgUrlList.add("http://gaopin-img.bj.bcebos.com/chinacity.jpg");
        params.putStringArrayList(QzoneShare.SHARE_TO_QQ_IMAGE_URL,imgUrlList);// 图片地址
        // 分享操作要在主线程中完成
        mTencent.shareToQzone(activity, params,listener);
    }




}
