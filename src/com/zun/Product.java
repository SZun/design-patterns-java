package com.zun;

import java.util.Iterator;
import java.util.LinkedList;

public class Product {

    private LinkedList<String> parts;

    public Product() {
        this.parts = new LinkedList<>();
    }

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        Iterator<String> iterator = parts.iterator();
        for(String i : parts) System.out.println(i);
    }
}
