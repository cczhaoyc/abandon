package com.suxia.abandon.proxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args){
//        MyProxy myProxy = new MyProxy();
//        TimeHandler handler = new TimeHandler(myProxy);
//
//        Class<? extends MyProxy> c = myProxy.getClass();
//        IProxy iProxy = (IProxy)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), c.getInterfaces(), handler);
//        iProxy.say();

        Cat cat = new Cat();
        TimeHandler handler = new TimeHandler(cat);
        Class<? extends Cat> c = cat.getClass();
        IProxy iProxy = (IProxy)Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), handler);
        iProxy.say();
        System.out.println(c.getInterfaces().getClass().getSimpleName());
    }
}
