package com.hwq.lib_common.wxapi;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;


import com.hwq.lib_common.utils.Configer;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;


public class WXEntryActivity extends Activity implements IWXAPIEventHandler {


    private IWXAPI iwxapi;

    private SendAuth.Resp resp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        // 隐藏状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        iwxapi = WXAPIFactory.createWXAPI(this, Configer.APP_ID, true);
        //接收到分享以及登录的intent传递handleIntent方法，处理结果
        iwxapi.handleIntent(getIntent(), this);

    }


    @Override
    public void onReq(BaseReq baseReq) {
    }


    //请求回调结果处理
    @Override
    public void onResp(BaseResp baseResp) {
        //微信登录为getType为1，分享为0
        if (baseResp.getType() == 1) {
            //登录回调
            System.out.println("------------登陆回调------------");
            resp = (SendAuth.Resp) baseResp;
            switch (resp.errCode) {
                case BaseResp.ErrCode.ERR_OK:
                    String code = String.valueOf(resp.code);
                    //获取用户信息
                    getUserInfo(code);
                    break;
                case BaseResp.ErrCode.ERR_AUTH_DENIED://用户拒绝授权
                    Toast.makeText(this, "用户拒绝授权", Toast.LENGTH_SHORT).show();
                    finish();
                    break;
                case BaseResp.ErrCode.ERR_USER_CANCEL://用户取消
                    Toast.makeText(this, "用户取消", Toast.LENGTH_SHORT).show();
                    finish();
                    break;
                default:
                    break;
            }
        } else {
            //分享成功回调
            switch (baseResp.errCode) {
                case BaseResp.ErrCode.ERR_OK:
                    //分享成功
                    break;
                case BaseResp.ErrCode.ERR_USER_CANCEL:
                    //分享取消
                    break;
                case BaseResp.ErrCode.ERR_AUTH_DENIED:
                    //分享拒绝
                    break;
            }
            finish();
        }
    }

    private void getUserInfo(String code) {
        String http = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + Configer.APP_ID + "&secret=" + Configer.APP_SERECET + "&code=" + code + "&grant_type=authorization_code";
//        OkHttpUtils.get()
//                .url(http)
//                .build()
//                .execute(new GenericsCallback<WxTokenBean>(new JsonGenericsSerializator()) {
//                    @Override
//                    public void onError(Call call, Exception e, int id) {
//
//                    }
//
//                    @Override
//                    public void onResponse(WxTokenBean response, int id) {
//                        //获取个人信息
//                        String getUserInfo = "https://api.weixin.qq.com/sns/userinfo?access_token=" + response.getAccess_token() + "&openid=" + response.getOpenid() + "";
//                        getAccountInfo(getUserInfo);
//                    }
//                });
    }

    private void getAccountInfo(String getUserInfo) {
//        OkHttpUtils.get()
//                .url(getUserInfo)
//                .build()
//                .execute(new GenericsCallback<WxInfoBean>(new JsonGenericsSerializator()) {
//                    @Override
//                    public void onError(Call call, Exception e, int id) {
//
//                    }
//
//                    @Override
//                    public void onResponse(WxInfoBean response, int id) {
//                        EventBus.getDefault().post(response);
//                        finish();
//                    }
//                });

    }
}

