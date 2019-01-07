package com.suxia.abandon.ref;

public class Man implements People {

     static {
        System.out.println("这是一个静态代码块");
    }

    @Override
    public void say() {
        System.out.println("这是一个Man");
    }
}
