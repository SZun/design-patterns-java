package com.zun;

public class Client {

    public static void main(String[] args) {

        Shape shape1 = new ShapeFactory().getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = new ShapeFactory().getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = new ShapeFactory().getShape("SQUARE");
        shape3.draw();

    }

}
