package com.zun;

public abstract class AbstractFactory {

    abstract Color getColor(String color);
    abstract Shape getShape(String shape);

}

class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape == null) return null;
        else if (shape.equalsIgnoreCase("Square")) return new Square();
        else if (shape.equalsIgnoreCase("Circle")) return new Circle();
        else if (shape.equalsIgnoreCase("Rectangle")) return new Rectangle();
        return null;
    }
}

class ColorFacory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if(color == null) return null;
        else if (color.equalsIgnoreCase("RED")) return new Red();
        else if (color.equalsIgnoreCase("GREEN")) return new Green();
        else if (color.equalsIgnoreCase("BLUE")) return new Blue();
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
