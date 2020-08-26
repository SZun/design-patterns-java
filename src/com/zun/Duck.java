package com.zun;

public interface Duck {

    void quack();
    void fly();

}

class Mallard implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}
