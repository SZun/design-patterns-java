package com.zun;

import java.awt.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BasicCarCache.loadCache();

        BasicCar bc1 = (BasicCar) BasicCarCache.getCar("Green Nano");
        bc1.price = bc1.price + BasicCar.setAndGetPrice();
        System.out.println("Car " + bc1.getModelName() + " costs " + bc1.price);

        bc1 = (BasicCar) BasicCarCache.getCar("Ford Yellow");
        bc1.price = bc1.price + BasicCar.setAndGetPrice();
        System.out.println("Car " + bc1.getModelName() + " costs " + bc1.price);
    }
}
