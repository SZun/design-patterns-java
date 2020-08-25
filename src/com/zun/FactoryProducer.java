package com.zun;

public class FactoryProducer {

    public static IMovieFactory getFactory(String choice){
        if(choice == null) return null;
        else if(choice.equalsIgnoreCase("BOLLY")) return new BollyWoodMovieFactory();
        else if(choice.equalsIgnoreCase("HOLLY")) return new HollyWoodMovieFactory();
        return null;
    }

}
