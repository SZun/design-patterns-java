package com.zun;

import java.util.ArrayList;
import java.util.List;

interface Subject {

    void registerObserver(Observer obj);
    void unregisterObserver(Observer obj);
    void notifyObserver();

}

class CricketData implements Subject {

    private final int runs = 90, wickets = 10;
    private float overs = 10.2f;
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void unregisterObserver(Observer obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObserver() {
        observerList.forEach(i -> i.update(runs,wickets,overs));
    }

    public void dataChanged(){
        notifyObserver();
    }

}
