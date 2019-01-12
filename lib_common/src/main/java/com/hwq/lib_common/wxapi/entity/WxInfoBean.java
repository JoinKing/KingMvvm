package com.hwq.lib_common.wxapi.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class WxInfoBean implements Parcelable{

    /**
     * openid : odhB51JFZo4KCBJ0NCSfhZppvHrw
     * nickname :
     * sex : 1
     * language : zh_CN
     * city : Chengdu
     * province : Sichuan
     * country : CN
     * headimgurl : http://thirdwx.qlogo.cn/mmopen/vi_32/PiajxSqBRaEJOicAkB9ZZ6n8rN3N6qMdEnxmTI190e7RMwfZyjb2ylpsMXCflaCZLwbdPiaSLx8PGDeXjXKlbpvibw/132
     * privilege : []
     * unionid : oG_Qv1dOatdZXW7A1slT1v1u-iBI
     */

    private String openid;
    private String nickname;
    private int sex;
    private String language;
    private String city;
    private String province;
    private String country;
    private String headimgurl;
    private String unionid;
    private List<?> privilege;

    protected WxInfoBean(Parcel in) {
        openid = in.readString();
        nickname = in.readString();
        sex = in.readInt();
        language = in.readString();
        city = in.readString();
        province = in.readString();
        country = in.readString();
        headimgurl = in.readString();
        unionid = in.readString();
    }

    public static final Creator<WxInfoBean> CREATOR = new Creator<WxInfoBean>() {
        @Override
        public WxInfoBean createFromParcel(Parcel in) {
            return new WxInfoBean(in);
        }

        @Override
        public WxInfoBean[] newArray(int size) {
            return new WxInfoBean[size];
        }
    };

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public List<?> getPrivilege() {
        return privilege;
    }

    public void setPrivilege(List<?> privilege) {
        this.privilege = privilege;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(openid);
        dest.writeString(nickname);
        dest.writeInt(sex);
        dest.writeString(language);
        dest.writeString(city);
        dest.writeString(province);
        dest.writeString(country);
        dest.writeString(headimgurl);
        dest.writeString(unionid);
    }


    @Override
    public String toString() {
        return "WxInfoBean{" +
                "openid='" + openid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex=" + sex +
                ", language='" + language + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", headimgurl='" + headimgurl + '\'' +
                ", unionid='" + unionid + '\'' +
                ", privilege=" + privilege +
                '}';
    }
}
