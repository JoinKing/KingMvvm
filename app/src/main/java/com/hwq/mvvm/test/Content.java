package com.hwq.mvvm.test;

public class Content {
    private static Content content;


    private Content(){}

    public static Content init(Listenter listenter){
        if (content!=null){
            content = new Content(listenter);
        }

        return content;

    }

    private  Listenter listenter;

    public Content(Listenter listenter) {
        this.listenter = listenter;
    }
}
