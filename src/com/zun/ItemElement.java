package com.zun;

interface ItemElement {

    int accept(ShoppingCartVisitor visitor);

}

class Book implements ItemElement {

    private final int price;
    private final String isbnNum;

    public Book(int price, String isbnNum) {
        this.price = price;
        this.isbnNum = isbnNum;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNum() {
        return isbnNum;
    }
}

class Fruit implements ItemElement {

    private final int pricePerKG, weight;
    private final String name;

    public Fruit(int pricePerKG, int weight, String name) {
        this.pricePerKG = pricePerKG;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    public int getPricePerKG() {
        return pricePerKG;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
