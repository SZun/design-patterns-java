package com.zun;

public class Director {

    IBuilder myBuilder;

    public void construct(IBuilder builder){
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlight();
    }

}
