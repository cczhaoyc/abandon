package com.suxia.abandon.proxy;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
    private Object t;

    public TimeHandler(Object t) {
        this.t = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始...");
        method.invoke(t);
        System.out.println("结束...");
        return null;
    }
}
