package com.zun;

public class Stock {

    private String name = "Google";
    private int qty = 1000;

    public void buy(){
        System.out.println("Stock [ Name: " + name + ", Quantity " + qty + "] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: " + name + ", Quantity " + qty + "] sold");
    }

}
