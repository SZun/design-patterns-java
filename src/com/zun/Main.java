package com.zun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    ShoppingCart cart = new ShoppingCart();

        Arrays.asList(
                new Item("1234", 10),
                new Item("5679", 40)
        ).forEach(cart::addItem);

        cart.pay(new PaypalStrategy("jason@email.com", "mypassword"));
        cart.pay(new CreditCardStrategy("jason fedin", "22222222222", "444", "12/20/20"));
    }
}
