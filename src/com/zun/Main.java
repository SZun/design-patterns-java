package com.zun;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        AuctionMediator auctionMediator = new AuctionMediator();

        Buyer b1 = new AuctionBuyer(auctionMediator, "Jason");
        Buyer b2 = new AuctionBuyer(auctionMediator, "Ian");
        Buyer b3 = new AuctionBuyer(auctionMediator, "Myra");

        Arrays.asList(b1,b2,b3).forEach(auctionMediator::addBuyer);

        System.out.println("Welcome");
        System.out.println("=========");
        System.out.println("Waiting for offers");

        b1.bid(1800);
        b2.bid(2000);
        b3.bid(780);

        System.out.println("=========");
        auctionMediator.findHighestBidder();

        b2.cancelBid();

        System.out.println(b2.getName() + " has canceled their bid!, because of this...");
        auctionMediator.findHighestBidder();
    }
}
