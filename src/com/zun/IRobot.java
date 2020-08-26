package com.zun;

public interface IRobot {

    void print();

    void setColor(String color);

}

class Robot implements IRobot {

    String type;
    String color;

    public Robot(String type) {
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("This is a " + type + " type robot with " + color + " color.");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}