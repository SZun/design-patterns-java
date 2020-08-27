package com.zun;

import java.util.ArrayList;
import java.util.List;

interface Subject {

    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObserver();
    Object getUpdate(Observer obj);

}

class MyTopic implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private String message;
    private boolean changed;

    @Override
    public void register(Observer obj) {
        if(!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObserver() {
        if(!changed) return;

        List<Observer> observers = new ArrayList<>(this.observers);
        this.changed = false;
        observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message posted to topic: " + msg);
        message = msg;
        changed = true;
        notifyObserver();
    }
}
