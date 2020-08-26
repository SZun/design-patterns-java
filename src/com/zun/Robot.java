package com.zun;

public interface Robot {

    void print();

}

class SmallRobot implements Robot {
    @Override
    public void print() {
        System.out.println("This is a small robot");
    }
}

class LargeRobot implements Robot {
    @Override
    public void print() {
        System.out.println("This is a large robot");
    }
}
