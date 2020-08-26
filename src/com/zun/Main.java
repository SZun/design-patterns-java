package com.zun;

public class Main {

    public static void main(String[] args) {
        Image image = new ProxyImage("someFileName.jpg");

        image.display();
        System.out.println();

        image.display();
    }
}
