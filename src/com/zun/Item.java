package com.zun;

public class Item {

    private final String upcCode;
    private final int cost;

    public Item(String upcCode, int cost) {
        this.upcCode = upcCode;
        this.cost = cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getCost() {
        return cost;
    }
}
