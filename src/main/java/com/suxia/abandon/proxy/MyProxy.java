package com.suxia.abandon.proxy;

public class MyProxy implements IProxy {


    @Override
    public void say(){
        System.out.println("这是一个被代理的对象...");
    }
}
