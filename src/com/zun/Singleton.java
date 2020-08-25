package com.zun;

public class Singleton {

    private int data = 0;

    private Singleton(){}

    private static class SingletonHelper {
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHelper.uniqueInstance;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }

}
