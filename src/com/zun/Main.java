package com.zun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<Visitable> items = Arrays.asList(
            new Book(8.52, 1.05),
            new CD(18.52, 3.05),
            new DVD(6.53, 4.02)
    );

    public static void main(String[] args) {

        Visitor visitor = new USPostageVisitor();
        System.out.println("Total US Postage: " + calcPostage(visitor));
        visitor = new SouthAmericanPostageVisitor();
        System.out.println("Total SA Postage: " + calcPostage(visitor));


    }

    private static double calcPostage(Visitor visitor){
        items.forEach(i -> i.accept(visitor));
        return visitor.getTotalPostageForCart();
    }

}
