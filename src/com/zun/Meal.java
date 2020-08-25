package com.zun;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item i){
        items.add(i);
    }

    public float getCost(){
        return (float) items.stream().mapToDouble(Item::getPrice).sum();
    }

    public void show(){
        items.forEach(item -> {
            System.out.print("Item: " + item.getName());
            System.out.print(" , Packing: " + item.getPacking().getPacking());
            System.out.println(" , Price: " + item.getPrice());
        });
    }

}
