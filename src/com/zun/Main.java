package com.zun;

public class Main {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println(clonedShape.getTipo());
        clonedShape = (Shape) ShapeCache.getShape("2");
        System.out.println(clonedShape.getTipo());
        clonedShape = (Shape) ShapeCache.getShape("3");
        System.out.println(clonedShape.getTipo());

    }
}
