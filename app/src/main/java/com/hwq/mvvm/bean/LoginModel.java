package com.hwq.mvvm.bean;

import android.os.Parcel;
import android.os.Parcelable;

public class LoginModel implements Parcelable {

    /**
     * userName : 1000
     * passWord : lsk;q,f..
     * nickName : 超级用户
     * age : 100
     * sex : 男
     * accountType : 2
     * signature : 有事请联系管理员
     * userState : 0
     */

    private String xxxx;
    private String userName;
    private String passWord;
    private String nickName;
    private int age;
    private String sex;
    private int accountType;
    private String signature;
    private String headImage;
    private int userState;

    protected LoginModel(Parcel in) {
        xxxx = in.readString();
        userName = in.readString();
        passWord = in.readString();
        nickName = in.readString();
        age = in.readInt();
        sex = in.readString();
        accountType = in.readInt();
        signature = in.readString();
        headImage = in.readString();
        userState = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(xxxx);
        dest.writeString(userName);
        dest.writeString(passWord);
        dest.writeString(nickName);
        dest.writeInt(age);
        dest.writeString(sex);
        dest.writeInt(accountType);
        dest.writeString(signature);
        dest.writeString(headImage);
        dest.writeInt(userState);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<LoginModel> CREATOR = new Creator<LoginModel>() {
        @Override
        public LoginModel createFromParcel(Parcel in) {
            return new LoginModel(in);
        }

        @Override
        public LoginModel[] newArray(int size) {
            return new LoginModel[size];
        }
    };

    public String getXxxx() {
        return xxxx;
    }

    public void setXxxx(String xxxx) {
        this.xxxx = xxxx;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    @Override
    public String toString() {
        return "LoginModel{" +
                "xxxx='" + xxxx + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", accountType=" + accountType +
                ", signature='" + signature + '\'' +
                ", headImage='" + headImage + '\'' +
                ", userState=" + userState +
                '}';
    }
}
