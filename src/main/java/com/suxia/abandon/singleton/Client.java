package com.suxia.abandon.singleton;

public class Client {

    public static void main(String[] args){
        System.out.println("饥汉模式");
        System.out.println(JiHanSingleton.getInstance().hashCode());
        System.out.println(JiHanSingleton.getInstance().hashCode());
        System.out.println("----------------------------------------------");
        System.out.println("懒汉模式");
        System.out.println(LanHanSingleton.getInstance().hashCode());
        System.out.println(LanHanSingleton.getInstance().hashCode());

    }
}
