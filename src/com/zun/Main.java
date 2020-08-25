package com.zun;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        IBuilder carBuilder = new Car();
        IBuilder motorcycleBuilder = new Motorcycle();

        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        director.construct(motorcycleBuilder);
        p1 = motorcycleBuilder.getVehicle();
        p1.show();

    }
}
