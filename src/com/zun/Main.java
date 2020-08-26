package com.zun;

public class Main {

    public static void main(String[] args) {
        Stock google = new Stock();

        BuyStock buyStock = new BuyStock(google);
        SellStock sellStock = new SellStock(google);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
