package com.zun;

import java.util.Arrays;

public class Main {

    private static final ItemElement[] items = new ItemElement[]{
            new Book(20, "1234"),new Book(100, "5678"),
            new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")
    };

    public static void main(String[] args) {
        System.out.println("Total Cost = "+ calculatePrice(items));
    }

    private static int calculatePrice(ItemElement[] items) {
        return Arrays.stream(items).mapToInt(i -> i.accept(new ShoppingCartVisitorImpl())).sum();
    }
}
