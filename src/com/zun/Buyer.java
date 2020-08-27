package com.zun;

abstract class Buyer {

    protected final Mediator mediator;
    protected final String name;
    protected int price;

    public Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int price);
    public abstract void cancelBid();
    public abstract void auctionHasEnded();

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class AuctionBuyer extends Buyer {

    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        this.price = price;
    }

    @Override
    public void cancelBid() {
        price = -1;
    }

    @Override
    public void auctionHasEnded() {
        System.out.println("Recieved message that the auction is over: " + name);
    }
}
