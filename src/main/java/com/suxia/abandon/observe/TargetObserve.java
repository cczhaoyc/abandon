package com.suxia.abandon.observe;

import java.util.Observable;

public class TargetObserve extends Observable {

    private String message;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        this.setChanged();
        this.notifyObservers();
    }


}
