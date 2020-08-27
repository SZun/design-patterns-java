package com.zun;

abstract class OrderProcessTemplate {

    public abstract void doSelect();
    public abstract void doPayment();
    public abstract void doDelivery();

    public final void giftWrap(){
        System.out.println("Gift wrapped successfully");
    }

    public final void processOrder(boolean isGift){
        doSelect();
        doPayment();
        if(isGift) giftWrap();
        doDelivery();
    }

}

class NetOrder extends OrderProcessTemplate {

    @Override
    public void doSelect(){
        System.out.println("Item added to online shopping cart");
        System.out.println("Get gift wrapped preference");
        System.out.println("Get delivery address");
    }

    @Override
    public void doPayment() {
        System.out.println("Online payment through Netbanking, card or PayPal");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item through the post office to delivery address");
    }
}

class StoreOrder extends OrderProcessTemplate {

    @Override
    public void doSelect() {
        System.out.println("Customer chooses the item from shelf");
    }

    @Override
    public void doPayment() {
        System.out.println("Pays at counter through card/POS");
    }

    @Override
    public void doDelivery() {
        System.out.println("item is delivered to in delivery counter");
    }
}
