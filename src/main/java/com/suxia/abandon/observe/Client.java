package com.suxia.abandon.observe;

public class Client {

    public static void main(String[] args) {

        TargetObserve targerObserve = new TargetObserve();

        IObserver gril = new IObserver();
        gril.setObserverName("小红");

        IObserver boy = new IObserver();
        boy.setObserverName("小名");

        targerObserve.addObserver(gril);
        targerObserve.addObserver(boy);

        targerObserve.setMessage("今天周五了");

    }
}
