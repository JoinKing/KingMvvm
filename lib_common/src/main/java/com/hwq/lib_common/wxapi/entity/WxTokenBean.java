package com.hwq.lib_common.wxapi.entity;

public class WxTokenBean {

    /**
     * access_token : 14_B9ne24TRe9tEFJ4E81XwUs9gThDP8D-huwEBxEj9j6uVZMUx_4ZldgbMiztmhCxzMmzt6zzW-km2IVLAI8LC69RYINUy6VZusxYKmyfzbEU
     * expires_in : 7200
     * refresh_token : 14_M5WDLps8CiS453sANjwYcUEgcb87cnue5oWKD994mH5EN5x85Xw54GuC8l4VFmUVstJfYziVkyYGC0r2FcwVf6Js_Vvzw2tGIhqf878ueis
     * openid : odhB51JFZo4KCBJ0NCSfhZppvHrw
     * scope : snsapi_userinfo
     * unionid : oG_Qv1dOatdZXW7A1slT1v1u-iBI
     */

    private String access_token;
    private int expires_in;
    private String refresh_token;
    private String openid;
    private String scope;
    private String unionid;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    @Override
    public String toString() {
        return "WxTokenBean{" +
                "access_token='" + access_token + '\'' +
                ", expires_in=" + expires_in +
                ", refresh_token='" + refresh_token + '\'' +
                ", openid='" + openid + '\'' +
                ", scope='" + scope + '\'' +
                ", unionid='" + unionid + '\'' +
                '}';
    }
}
