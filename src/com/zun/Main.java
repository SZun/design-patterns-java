package com.zun;

public class Main {

    public static void main(String[] args) {
	    HouseTemplate house = new WoodenHouse();

	    house.buildHouse();

        System.out.println("*** *** *** *** *** ***");

        house = new GlassHouse();

        house.buildHouse();
    }
}
