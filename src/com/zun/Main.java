package com.zun;

public class Main {

    public static void main(String[] args) {
	    Mallard mallard = new Mallard();
	    WildTurkey wildTurkey = new WildTurkey();
	    Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
	    wildTurkey.fly();
	    wildTurkey.gobble();
	    printDuck(turkeyAdapter);
        printDuck(mallard);
    }

    static void printDuck(Duck d){
        d.quack();
        d.fly();
    }
}
