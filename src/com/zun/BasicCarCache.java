package com.zun;

import java.util.Hashtable;

public class BasicCarCache {

    private static Hashtable<String, BasicCar> hashtable = new Hashtable<>();

    public static BasicCar getCar(String name) throws CloneNotSupportedException {
        return (BasicCar) hashtable.get(name).clone();
    }

    public static void loadCache(){
        BasicCar nanoBase = new Nano("Green Nano");
        nanoBase.price = 100000;
        hashtable.put(nanoBase.getModelName(), nanoBase);

        BasicCar fordBase = new Ford("Ford Yellow");
        fordBase.price = 500000;
        hashtable.put(fordBase.getModelName(), fordBase);
    }
}
