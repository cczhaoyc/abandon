package com.suxia.abandon.iproxy;

public class Client {

    public static void main(String[] a){
        Targer targer = new Proxy(new TargerImpl());
        targer.init();
    }
}
