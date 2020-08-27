package com.zun;

public interface PaymentStrategy {

    void pay(int amount);

}

class CreditCardStrategy implements PaymentStrategy {

    private final String name, cardNumber, cvv, dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with card");
    }
}

class PaypalStrategy implements PaymentStrategy {

    private final String email, password;

    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with PayPal");
    }
}
