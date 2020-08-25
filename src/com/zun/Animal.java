package com.zun;

public interface Animal {

    void eat();

}

class Tiger implements Animal {
    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }
}

class Duck implements Animal {
    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
