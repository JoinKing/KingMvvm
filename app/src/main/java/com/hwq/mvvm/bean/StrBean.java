package com.hwq.mvvm.bean;

import android.os.Parcel;
import android.os.Parcelable;

public class StrBean implements Parcelable{


    /**
     * xxxx : aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
     */

    private String xxxx;

    protected StrBean(Parcel in) {
        xxxx = in.readString();
    }

    public static final Creator<StrBean> CREATOR = new Creator<StrBean>() {
        @Override
        public StrBean createFromParcel(Parcel in) {
            return new StrBean(in);
        }

        @Override
        public StrBean[] newArray(int size) {
            return new StrBean[size];
        }
    };

    public String getXxxx() {
        return xxxx;
    }

    public void setXxxx(String xxxx) {
        this.xxxx = xxxx;
    }

    @Override
    public String toString() {
        return "StrBean{" +
                "xxxx='" + xxxx + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(xxxx);
    }
}
