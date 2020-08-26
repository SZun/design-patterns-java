package com.zun;

public interface Order {

    void execute();

}

class BuyStock implements Order {

    private final Stock myStock;

    public BuyStock(Stock myStock) {
        this.myStock = myStock;
    }

    @Override
    public void execute() {
        myStock.buy();
    }
}

class SellStock implements Order {

    private final Stock myStock;

    public SellStock(Stock myStock) {
        this.myStock = myStock;
    }

    @Override
    public void execute() {
        myStock.sell();
    }
}
