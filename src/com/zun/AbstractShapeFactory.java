package com.zun;

public abstract class AbstractShapeFactory {

    public abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }

}

class RectangleFactory extends AbstractShapeFactory {

    @Override
    public Shape factoryMethod() {
        return new Rectangle();
    }
}

class SquareFactory extends AbstractShapeFactory {

    @Override
    public Shape factoryMethod() {
        return new Square();
    }
}

class CircleFactory extends AbstractShapeFactory {

    @Override
    public Shape factoryMethod() {
        return new Circle();
    }
}


