package com.zun;

public class Singleton {

    private volatile static Singleton uniqueInstance = new Singleton();
    private int data = 0;

    private Singleton(){}

    public static Singleton getInstance(){
        return uniqueInstance;
    }

    public void setDate(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }

}
