package com.hwq.lib_common.wxapi;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;


import com.hwq.lib_common.bus.RxBus;
import com.hwq.lib_common.http.utils.RetrofitClient;
import com.hwq.lib_common.wxapi.api.WxSubscribe;
import com.hwq.lib_common.wxapi.entity.WxInfoBean;
import com.hwq.lib_common.wxapi.entity.WxTokenBean;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import java.util.HashMap;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class WXEntryActivity extends Activity implements IWXAPIEventHandler {

    private IWXAPI iwxapi;
    private SendAuth.Resp resp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        iwxapi = WXAPIFactory.createWXAPI(this, RetrofitClient.APP_ID, true);
        //接收到分享以及登录的intent传递handleIntent方法，处理结果
        iwxapi.handleIntent(getIntent(), this);

    }


    @Override
    public void onReq(BaseReq baseReq) {
    }

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
        HashMap<String, String> prams = new HashMap<>();
        prams.put("appid", RetrofitClient.APP_ID);
        prams.put("secret", RetrofitClient.APP_SERECET);
        prams.put("code", "&grant_type=authorization_code");

        WxSubscribe.getToken(prams, new Observer<WxTokenBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(WxTokenBean wxTokenBean) {
                getAccountInfo(wxTokenBean.getAccess_token(), wxTokenBean.getOpenid());
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }

    private void getAccountInfo(String access_token, String openid) {
        HashMap<String, String> prams = new HashMap<>();
        prams.put("access_token", access_token);
        prams.put("openid", openid);
        WxSubscribe.getInforMation(prams, new Observer<WxInfoBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(WxInfoBean wxInfoBean) {
                //使用Rxbus将数据发送到登陆页面
                //在接收的页面进行注册接收消息
                RxBus.getDefault().post(wxInfoBean);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                onBackPressed();
            }
        });
    }
}

