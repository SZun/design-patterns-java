package com.zun;

public class Context {

    private final String input;

    public Context(String input) {
        this.input = input;
    }

    public boolean getRes(String data){
        return input.contains(data);
    }
}
