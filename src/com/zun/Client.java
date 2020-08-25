package com.zun;

public class Client {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal("Tiger");
        animal.eat();
        animal = animalFactory.getAnimal("Duck");
        animal.eat();
        animal = animalFactory.getAnimal("Dog");
        animal.eat();

    }

}
