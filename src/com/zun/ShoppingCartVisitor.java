package com.zun;



interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);

}

class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int price = book.getPrice();

        if(price > 50){
            price -= 5;
        }

        System.out.println("Book ISBN:: " + book.getIsbnNum() + " cost=" + price);

        return price;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKG() * fruit.getWeight();

        System.out.println(fruit.getName() + " costs " + cost);

        return cost;
    }
}
