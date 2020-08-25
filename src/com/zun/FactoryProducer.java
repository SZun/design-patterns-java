package com.zun;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice == null) return null;
        else if(choice.equalsIgnoreCase("SHAPE")) return new ShapeFactory();
        else if(choice.equalsIgnoreCase("COLOR")) return new ColorFacory();
        return null;
    }

}
