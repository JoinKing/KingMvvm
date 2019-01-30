package com.hwq.mvvm.test;

public class Main implements Listenter {

    public Main() {

        Content.init(this);
    }

    @Override
    public void handler(String msg) {

    }
}
