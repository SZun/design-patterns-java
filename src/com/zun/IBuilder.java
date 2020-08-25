package com.zun;

public interface IBuilder {

    void buildBody();

    void insertWheels();

    void addHeadlight();

    Product getVehicle();

}

class Car implements IBuilder {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is the body of a car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadlight() {
        product.add("2 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}

class Motorcycle implements IBuilder {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is the body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlight() {
        product.add("1 headlight are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
