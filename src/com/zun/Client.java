package com.zun;

public class Client {

    public static void main(String[] args) {

        IMovieFactory factory = FactoryProducer.getFactory("BOLLY");

        BollyWoodMovie bollyWoodMovie1 = factory.getBollyWoodMovie("action");
        BollyWoodMovie bollyWoodMovie2 = factory.getBollyWoodMovie("comedy");

        System.out.println(bollyWoodMovie1.getName());
        System.out.println(bollyWoodMovie2.getName());

        factory = FactoryProducer.getFactory("HOLLY");

        HollyWoodMovie hollyWoodMovie1 = factory.getHollyWoodMovie("comedy");
        HollyWoodMovie hollyWoodMovie2 = factory.getHollyWoodMovie("action");

        System.out.println(hollyWoodMovie1.getName());
        System.out.println(hollyWoodMovie2.getName());

    }

}
