package com.hwq.mvvm.rxbus;

public class RxBusEvent {
    String msg;

    public RxBusEvent(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "RxBusEvent{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
