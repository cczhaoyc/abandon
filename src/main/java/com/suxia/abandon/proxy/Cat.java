package com.suxia.abandon.proxy;

public class Cat implements IProxy {
    @Override
    public void say() {
        System.out.println("我是一只猫");
    }
}
