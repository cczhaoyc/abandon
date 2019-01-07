package com.suxia.abandon.singleton;

/**
 * 饥汉模式
 */
public class JiHanSingleton {

    private static final JiHanSingleton instance = new JiHanSingleton();

    private JiHanSingleton(){}

    public static JiHanSingleton getInstance(){
        return  instance;
    }
}
