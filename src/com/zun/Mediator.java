package com.zun;

import java.util.ArrayList;
import java.util.List;

public interface Mediator {

    void addBuyer(Buyer buyer);

    void findHighestBidder();

}

class AuctionMediator implements Mediator {

    private List<Buyer> buyers = new ArrayList<>();

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.getName() + " was added to the buyers list.");
    }

    @Override
    public void findHighestBidder() {
        int maxBid = buyers.stream().mapToInt(Buyer::getPrice).max().orElse(Integer.MIN_VALUE);
        Buyer winner = buyers.stream().filter(i -> i.getPrice() == maxBid).findAny().orElse(null);
        buyers.forEach(Buyer::auctionHasEnded);
        if (winner != null) {
            System.out.println("The auction winner is " + winner.getName() + ". They paid $" + maxBid + " for the item");
        } else System.out.println("No winner");
    }
}