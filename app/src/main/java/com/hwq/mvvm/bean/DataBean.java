package com.hwq.mvvm.bean;

import android.os.Parcel;
import android.os.Parcelable;

public class DataBean {
        /**
         * certificateCode : c2b14eb3-d01b-464b-8bad-9cd7a0db28e5
         * userinfo : {"CSMZT":2,"IZT":1,"CDLFS  ":3,"INL":21,"CHZZY":"564324","CSFZBM":"/file/fm.png","CHZTZ":43,"CHZJZD":"大成都","CHZTX":"/file/dasdka.png","DHZCJSJ":"2018-08-27 16: 46: 37","CJKDABH":"健康档案编号","CSFZH":"513021198910121192","DZHDL":"2018-09-20 10: 49: 15","CHZXM":"认证姓名","CHZNC":"昵称","CXBMC":"男","CXBBM":"1","DCSNY":"1982-07-01 00: 00: 00","CHZSJH":"18180898841","CTNBLX":" 1型糖尿病","CSFZZM":"/file/zm.png","CHZBM":"1","CSCSFZ":"/file/sc.png","CHMDYY":"1","CHZSG":151,"DHZXGSJ":"2018-09-12 13: 48: 41","CQYBRBH":"CQYBRBH"}
         * status : 1
         */

        private String token;
        private UserinfoBean userinfo;
        private String status;

        public String getCertificateCode() {
            return token;
        }

        public void setCertificateCode(String certificateCode) {
            this.token = certificateCode;
        }

        public UserinfoBean getUserinfo() {
            return userinfo;
        }

        public void setUserinfo(UserinfoBean userinfo) {
            this.userinfo = userinfo;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "token='" + token + '\'' +
                    ", userinfo=" + userinfo +
                    ", status='" + status + '\'' +
                    '}';
        }

        public static class UserinfoBean implements Parcelable {
            /**
             * CSMZT : 2
             * IZT : 1
             * CDLFS   : 3
             * INL : 21
             * CHZZY : 564324
             * CSFZBM : /file/fm.png
             * CHZTZ : 43
             * CHZJZD : 大成都
             * CHZTX : /file/dasdka.png
             * DHZCJSJ : 2018-08-27 16: 46: 37
             * CJKDABH : 健康档案编号
             * CSFZH : 513021198910121192
             * DZHDL : 2018-09-20 10: 49: 15
             * CHZXM : 认证姓名
             * CHZNC : 昵称
             * CXBMC : 男
             * CXBBM : 1
             * DCSNY : 1982-07-01 00: 00: 00
             * CHZSJH : 18180898841
             * CTNBLX :  1型糖尿病
             * CSFZZM : /file/zm.png
             * CHZBM : 1
             * CSCSFZ : /file/sc.png
             * CHMDYY : 1
             * CHZSG : 151
             * DHZXGSJ : 2018-09-12 13: 48: 41
             * CQYBRBH : CQYBRBH
             */

            private int CSMZT = -1;
            private int IZT = -1;
            private int CDLFS = -1;
            private int INL = -1;
            private String CHZZY = "";
            private String CSFZBM = "";
            private int CHZTZ = -1;
            private String GRDAID = "";
            private String CHZJZD = "";
            private String CHZTX = "";
            private String DHZCJSJ = "";
            private String CJKDABH = "";
            private String CSFZH = "";
            private String DZHDL = "";
            private String CHZXM = "";
            private String CHZNC = "";
            private String CXBMC = "";
            private String CXBBM = "";
            private String DCSNY = "";
            private String CHZSJH = "";
            private String CTNBLX = "";
            private String CSFZZM = "";
            private String CHZBM = "";
            private String CSCSFZ = "";
            private String CHMDYY = "";
            private int CHZSG = -1;
            private String DHZXGSJ = "";
            private String CQYBRBH = "";

            protected UserinfoBean(Parcel in) {
                CSMZT = in.readInt();
                IZT = in.readInt();
                CDLFS = in.readInt();
                INL = in.readInt();
                CHZZY = in.readString();
                CSFZBM = in.readString();
                CHZTZ = in.readInt();
                GRDAID = in.readString();
                CHZJZD = in.readString();
                CHZTX = in.readString();
                DHZCJSJ = in.readString();
                CJKDABH = in.readString();
                CSFZH = in.readString();
                DZHDL = in.readString();
                CHZXM = in.readString();
                CHZNC = in.readString();
                CXBMC = in.readString();
                CXBBM = in.readString();
                DCSNY = in.readString();
                CHZSJH = in.readString();
                CTNBLX = in.readString();
                CSFZZM = in.readString();
                CHZBM = in.readString();
                CSCSFZ = in.readString();
                CHMDYY = in.readString();
                CHZSG = in.readInt();
                DHZXGSJ = in.readString();
                CQYBRBH = in.readString();
            }

            public static final Creator<UserinfoBean> CREATOR = new Creator<UserinfoBean>() {
                @Override
                public UserinfoBean createFromParcel(Parcel in) {
                    return new UserinfoBean(in);
                }

                @Override
                public UserinfoBean[] newArray(int size) {
                    return new UserinfoBean[size];
                }
            };

            public String getGRDAID() {
                return GRDAID;
            }

            public void setGRDAID(String GRDAID) {
                this.GRDAID = GRDAID;
            }

            public int getCSMZT() {
                return CSMZT;
            }

            public void setCSMZT(int CSMZT) {
                this.CSMZT = CSMZT;
            }

            public int getIZT() {
                return IZT;
            }

            public void setIZT(int IZT) {
                this.IZT = IZT;
            }

            public int getCDLFS() {
                return CDLFS;
            }

            public void setCDLFS(int CDLFS) {
                this.CDLFS = CDLFS;
            }

            public int getINL() {
                return INL;
            }

            public void setINL(int INL) {
                this.INL = INL;
            }

            public String getCHZZY() {
                return CHZZY;
            }

            public void setCHZZY(String CHZZY) {
                this.CHZZY = CHZZY;
            }

            public String getCSFZBM() {
                return CSFZBM;
            }

            public void setCSFZBM(String CSFZBM) {
                this.CSFZBM = CSFZBM;
            }

            public int getCHZTZ() {
                return CHZTZ;
            }

            public void setCHZTZ(int CHZTZ) {
                this.CHZTZ = CHZTZ;
            }

            public String getCHZJZD() {
                return CHZJZD;
            }

            public void setCHZJZD(String CHZJZD) {
                this.CHZJZD = CHZJZD;
            }

            public String getCHZTX() {
                return CHZTX;
            }

            public void setCHZTX(String CHZTX) {
                this.CHZTX = CHZTX;
            }

            public String getDHZCJSJ() {
                return DHZCJSJ;
            }

            public void setDHZCJSJ(String DHZCJSJ) {
                this.DHZCJSJ = DHZCJSJ;
            }

            public String getCJKDABH() {
                return CJKDABH;
            }

            public void setCJKDABH(String CJKDABH) {
                this.CJKDABH = CJKDABH;
            }

            public String getCSFZH() {
                return CSFZH;
            }

            public void setCSFZH(String CSFZH) {
                this.CSFZH = CSFZH;
            }

            public String getDZHDL() {
                return DZHDL;
            }

            public void setDZHDL(String DZHDL) {
                this.DZHDL = DZHDL;
            }

            public String getCHZXM() {
                return CHZXM;
            }

            public void setCHZXM(String CHZXM) {
                this.CHZXM = CHZXM;
            }

            public String getCHZNC() {
                return CHZNC;
            }

            public void setCHZNC(String CHZNC) {
                this.CHZNC = CHZNC;
            }

            public String getCXBMC() {
                return CXBMC;
            }

            public void setCXBMC(String CXBMC) {
                this.CXBMC = CXBMC;
            }

            public String getCXBBM() {
                return CXBBM;
            }

            public void setCXBBM(String CXBBM) {
                this.CXBBM = CXBBM;
            }

            public String getDCSNY() {
                return DCSNY;
            }

            public void setDCSNY(String DCSNY) {
                this.DCSNY = DCSNY;
            }

            public String getCHZSJH() {
                return CHZSJH;
            }

            public void setCHZSJH(String CHZSJH) {
                this.CHZSJH = CHZSJH;
            }

            public String getCTNBLX() {
                return CTNBLX;
            }

            public void setCTNBLX(String CTNBLX) {
                this.CTNBLX = CTNBLX;
            }

            public String getCSFZZM() {
                return CSFZZM;
            }

            public void setCSFZZM(String CSFZZM) {
                this.CSFZZM = CSFZZM;
            }

            public String getCHZBM() {
                return CHZBM;
            }

            public void setCHZBM(String CHZBM) {
                this.CHZBM = CHZBM;
            }

            public String getCSCSFZ() {
                return CSCSFZ;
            }

            public void setCSCSFZ(String CSCSFZ) {
                this.CSCSFZ = CSCSFZ;
            }

            public String getCHMDYY() {
                return CHMDYY;
            }

            public void setCHMDYY(String CHMDYY) {
                this.CHMDYY = CHMDYY;
            }

            public int getCHZSG() {
                return CHZSG;
            }

            public void setCHZSG(int CHZSG) {
                this.CHZSG = CHZSG;
            }

            public String getDHZXGSJ() {
                return DHZXGSJ;
            }

            public void setDHZXGSJ(String DHZXGSJ) {
                this.DHZXGSJ = DHZXGSJ;
            }

            public String getCQYBRBH() {
                return CQYBRBH;
            }

            public void setCQYBRBH(String CQYBRBH) {
                this.CQYBRBH = CQYBRBH;
            }

            @Override
            public String toString() {
                return "UserinfoBean{" +
                        "CSMZT=" + CSMZT +
                        ", IZT=" + IZT +
                        ", CDLFS=" + CDLFS +
                        ", INL=" + INL +
                        ", CHZZY='" + CHZZY + '\'' +
                        ", CSFZBM='" + CSFZBM + '\'' +
                        ", CHZTZ=" + CHZTZ +
                        ", CHZJZD='" + CHZJZD + '\'' +
                        ", CHZTX='" + CHZTX + '\'' +
                        ", DHZCJSJ='" + DHZCJSJ + '\'' +
                        ", CJKDABH='" + CJKDABH + '\'' +
                        ", CSFZH='" + CSFZH + '\'' +
                        ", DZHDL='" + DZHDL + '\'' +
                        ", CHZXM='" + CHZXM + '\'' +
                        ", CHZNC='" + CHZNC + '\'' +
                        ", CXBMC='" + CXBMC + '\'' +
                        ", CXBBM='" + CXBBM + '\'' +
                        ", DCSNY='" + DCSNY + '\'' +
                        ", CHZSJH='" + CHZSJH + '\'' +
                        ", CTNBLX='" + CTNBLX + '\'' +
                        ", CSFZZM='" + CSFZZM + '\'' +
                        ", CHZBM='" + CHZBM + '\'' +
                        ", CSCSFZ='" + CSCSFZ + '\'' +
                        ", CHMDYY='" + CHMDYY + '\'' +
                        ", CHZSG=" + CHZSG +
                        ", DHZXGSJ='" + DHZXGSJ + '\'' +
                        ", CQYBRBH='" + CQYBRBH + '\'' +
                        '}';
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(CSMZT);
                dest.writeInt(IZT);
                dest.writeInt(CDLFS);
                dest.writeInt(INL);
                dest.writeString(CHZZY);
                dest.writeString(CSFZBM);
                dest.writeInt(CHZTZ);
                dest.writeString(CHZJZD);
                dest.writeString(CHZTX);
                dest.writeString(DHZCJSJ);
                dest.writeString(CJKDABH);
                dest.writeString(CSFZH);
                dest.writeString(DZHDL);
                dest.writeString(CHZXM);
                dest.writeString(CHZNC);
                dest.writeString(CXBMC);
                dest.writeString(CXBBM);
                dest.writeString(DCSNY);
                dest.writeString(CHZSJH);
                dest.writeString(CTNBLX);
                dest.writeString(CSFZZM);
                dest.writeString(CHZBM);
                dest.writeString(CSCSFZ);
                dest.writeString(CHMDYY);
                dest.writeInt(CHZSG);
                dest.writeString(DHZXGSJ);
                dest.writeString(CQYBRBH);
            }
        }
}
