package com.zun;

interface Calc {

    public double getArea(Rectangle rectangle);

}

class Calculator implements Calc {

    Rectangle rectangle;

    @Override
    public double getArea(Rectangle r) {
        rectangle = r;
        return rectangle.length * rectangle.width;
    }
}
