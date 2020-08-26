package com.zun;

public class Main {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();

        ConcreteDecorator1 concreteDecorator1 = new ConcreteDecorator1();

        print(concreteDecorator1, concreteComponent);

        ConcreteDecorator2 concreteDecorator2 = new ConcreteDecorator2();

        print(concreteDecorator2, concreteComponent);
    }

    private static void print(AbstractDecorator abstractDecorator, Component component){
        abstractDecorator.setComponent(component);
        abstractDecorator.doJob();
    }
}
