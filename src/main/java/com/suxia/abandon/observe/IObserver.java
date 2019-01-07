package com.suxia.abandon.observe;

import java.util.Observable;
import java.util.Observer;

public class IObserver implements Observer {

    private String observerName;

    @Override
    public void update(Observable o, Object arg) {

        System.out.println(observerName + "收到的消息是:" + ((TargetObserve) o).getMessage());
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
