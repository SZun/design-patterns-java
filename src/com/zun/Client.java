package com.zun;

public class Client {

    public static void main(String[] args) {

        AbstractFactory factory = FactoryProducer.getFactory("SHAPE");

        factory.getShape("CIRCLE").draw();
        factory.getShape("SQUARE").draw();
        factory.getShape("RECTANGLE").draw();

        factory = FactoryProducer.getFactory("COLOR");

        factory.getColor("RED").fill();
        factory.getColor("GREEN").fill();
        factory.getColor("BLUE").fill();

    }

}
