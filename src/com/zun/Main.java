package com.zun;

public class Main {

    public static void main(String[] args) {
	    Vehicle vehicle = new Car(new Produce(), new Assemble());
	    vehicle.manufacture();
	    vehicle = new Bike(new Produce(), new Assemble());
	    vehicle.manufacture();
    }
}
