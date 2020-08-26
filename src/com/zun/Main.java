package com.zun;

import java.util.Scanner;

public class Main {
    private DispenseChain c1;

    public Main() {
        // initialize the chain
        this.c1 = new Dollar50Dispensor();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args)
    {
        Main atmDispensor = new Main();

        while(true)
        {
            int amount = 0;

            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }

            // process the request
            atmDispensor.c1.dispense(new Currency(amount));
        }
    }
}
