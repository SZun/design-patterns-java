package com.zun;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.setData(100);

        System.out.println("Singleton: " + s);
        System.out.println("Singleton data: " + s.getData());

        s = null;
        s = Singleton.getInstance();

        System.out.println("Singleton: " + s);
        System.out.println("Singleton data: " + s.getData());
    }

}
