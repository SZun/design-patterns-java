package com.zun;

public class Main {

    public static void main(String[] args) {
        CalcAdapter calcAdapter = new CalcAdapter(new Triangle(20,10));
        System.out.println("Area of triangle is " + calcAdapter.getArea(null));
    }
}
