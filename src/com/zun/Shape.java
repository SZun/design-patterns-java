package com.zun;

public abstract class Shape implements Cloneable {

    protected String id;
    protected String tipo;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }

        return clone;
    }
}

class Rectangle extends Shape {

    public Rectangle() {
        tipo = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }

}

class Square extends Shape {

    public Square() {
        tipo = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method");
    }

}

class Circle extends Shape {

    public Circle() {
        tipo = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method");
    }

}
