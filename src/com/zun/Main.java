package com.zun;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        System.out.println();
        redCircle.draw();
        System.out.println();
        redRectangle.draw();
    }

}
