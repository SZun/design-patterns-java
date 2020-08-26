package com.zun;

abstract class Shape {

    protected Color color;

    protected Shape(Color color){
        this.color = color;
    }

    abstract void drawShape(int border);
    abstract void modifyBorder(int border, int incremental);

}

class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This triangle is colored with");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int incremental) {
        System.out.println("\n Now we are changing the border length " + incremental + " times");
        border = border * incremental;
        drawShape(border);
    }
}

class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This rectangle is colored with");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int incremental) {
        System.out.println("\n Now we are changing the border length " + incremental + " times");
        border = border * incremental;
        drawShape(border);
    }
}
