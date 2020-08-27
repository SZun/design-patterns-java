package com.zun;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public int calcTotal(){
        return items.stream().mapToInt(Item::getCost).sum();
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calcTotal());
    }

}
