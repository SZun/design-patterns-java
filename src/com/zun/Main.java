package com.zun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Context context = new Context();

        Arrays.asList(new Add(), new Substract(), new Divide(), new Multiply())
                .forEach(i -> System.out.println(
                        context.executeStrategy(i, 5,5)
                ));
    }
}
