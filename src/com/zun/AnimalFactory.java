package com.zun;

public class AnimalFactory {

    Animal getAnimal(String animalName){
        if(animalName == null) return null;
        else if(animalName.equalsIgnoreCase("TIGER")) return new Tiger();
        else if(animalName.equalsIgnoreCase("Duck")) return new Duck();
        else if(animalName.equalsIgnoreCase("Dog")) return new Dog();
        return null;
    }

}
