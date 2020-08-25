package com.zun;

public class Client {

    public static void main(String[] args) {

        IMovieFactory factory = FactoryProducer.getFactory("COMEDY");

        System.out.println(factory.getHollyWoodMovie().getName());
        System.out.println(factory.getBollyWoodMovie().getName());

        factory = FactoryProducer.getFactory("ACTION");

        System.out.println(factory.getHollyWoodMovie().getName());
        System.out.println(factory.getBollyWoodMovie().getName());

    }

}
