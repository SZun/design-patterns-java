package com.zun;

public class Main {

    public static void main(String[] args) {
	    OrderProcessTemplate order = new NetOrder();
	    order.processOrder(true);

        System.out.println("*** *** *** *** *** *** *** *** ");

        order = new StoreOrder();
        order.processOrder(true);
    }
}
