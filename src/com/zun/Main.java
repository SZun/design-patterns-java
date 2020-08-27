package com.zun;

public class Main {

    public static void main(String[] args) {

        TV tv = new TV(new Off());
        tv.pressButton();
        tv.pressButton();

    }
}
