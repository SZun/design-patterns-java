package com.zun;

public interface Visitor {

    void visit(Book book);
    void visit(CD cd);
    void visit(DVD dvd);
    double getTotalPostageForCart();

}

class USPostageVisitor implements Visitor {
    private double totalPostageForCart = 0;

    @Override
    public void visit(Book book) {
        if(totalPostageForCart < 20d) totalPostageForCart += book.getWeight() * 2;
    }

    @Override
    public void visit(CD cd) {
        if(totalPostageForCart < 20d) totalPostageForCart += cd.getWeight() * 2;
    }

    @Override
    public void visit(DVD dvd) {
        if(totalPostageForCart < 20d) totalPostageForCart += dvd.getWeight() * 2;
    }

    public double getTotalPostageForCart() {
        return totalPostageForCart;
    }
}

class SouthAmericanPostageVisitor implements Visitor {

    private double totalPostageForCart = 0;

    @Override
    public void visit(Book book) {
        if(totalPostageForCart < 30d) totalPostageForCart += (book.getWeight() * 2) * 2;
    }

    @Override
    public void visit(CD cd) {
        if(totalPostageForCart < 30d) totalPostageForCart += (cd.getWeight() * 2) * 2;
    }

    @Override
    public void visit(DVD dvd) {
        if(totalPostageForCart < 30d) totalPostageForCart += (dvd.getWeight() * 2) * 2;
    }

    public double getTotalPostageForCart() {
        return totalPostageForCart;
    }
}
