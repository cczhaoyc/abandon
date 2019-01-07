package com.suxia.abandon.iproxy;

public class Proxy implements Targer{

    private Targer targer;

    public Proxy(Targer targer) {
        this.targer = targer;
    }

    @Override
    public void init() {
        System.out.println("Proxy Before");
        try {
            targer.init();
        }catch (Exception e){
            System.out.println("Proxy Exception");
            throw e;
        }finally {
            System.out.println("Proxy After");
        }
    }
}
