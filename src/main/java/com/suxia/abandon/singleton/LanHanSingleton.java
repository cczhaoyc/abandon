package com.suxia.abandon.singleton;

/**
 * 懒汉模式
 */
public class LanHanSingleton {

    private static volatile LanHanSingleton instance = null;

    private LanHanSingleton() {
    }

    public static LanHanSingleton getInstance() {
        if (instance == null) {
            synchronized (LanHanSingleton.class) {
                if (instance == null) {
                    instance = new LanHanSingleton();
                }
            }
        }
        return instance;
    }
}
