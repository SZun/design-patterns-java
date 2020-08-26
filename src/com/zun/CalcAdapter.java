package com.zun;

class CalcAdapter implements Calc {

    Calculator calculator = new Calculator();
    Triangle triangle;

    public CalcAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        rectangle = new Rectangle();
        rectangle.length = triangle.base;
        rectangle.width = 0.5 * triangle.height;
        return calculator.getArea(rectangle);
    }
}
