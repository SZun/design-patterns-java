package com.zun;

interface Shape {

    void draw();

}

class Rectangle implements Shape {

    @Override
    public void draw() {
        final String simpleName = this.getClass().getSimpleName();
        System.out.println("Shape: " + simpleName);
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        final String simpleName = this.getClass().getSimpleName();
        System.out.println("Shape: " + simpleName);
    }
}
