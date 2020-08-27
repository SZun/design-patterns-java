package com.zun;

public class Originator {

    private String state;

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
