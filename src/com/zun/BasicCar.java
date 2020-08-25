package com.zun;

import java.util.Random;

public abstract class BasicCar implements Cloneable {

    protected String modelName;
    protected static int price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public static int setAndGetPrice() {
        Random r = new Random();

        price = r.nextInt(100000);

        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }

}

class Ford extends BasicCar {

    public Ford(String m) {
        modelName = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}

class Nano extends BasicCar {

    public Nano(String m) {
        modelName = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano) super.clone();
    }
}
