package com.zun;

public interface Item {

    String getName();

    Packing getPacking();

    float getPrice();

}

abstract class Burger implements Item {

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }

    public abstract float getPrice();
}

class VegBurger extends Burger {

    @Override
    public String getName() {
        return "Veg Burger";
    }

    @Override
    public float getPrice() {
        return 25.0f;
    }
}

class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public float getPrice() {
        return 50.5f;
    }
}

abstract class ColdDrink implements Item {
    @Override
    public Packing getPacking() {
        return new Bottle();
    }

    @Override
    public abstract float getPrice();

}

class Pepsi extends ColdDrink {
    @Override
    public float getPrice() {
        return 1.0f;
    }

    @Override
    public String getName() {
        return "Pepsi";
    }
}

class Coke extends ColdDrink {
    @Override
    public float getPrice() {
        return 1.0f;
    }

    @Override
    public String getName() {
        return "Coke";
    }
}

interface Packing {
    String getPacking();
}

class Wrapper implements Packing {
    @Override
    public String getPacking() {
        return "Wrapper";
    }
}

class Bottle implements Packing {
    @Override
    public String getPacking() {
        return "Bottle";
    }
}
