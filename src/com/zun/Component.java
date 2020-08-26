package com.zun;

abstract class Component {

    abstract public void doJob();

}

class ConcreteComponent extends Component {

    @Override
    public void doJob() {
        System.out.println("I am from a Concrete Component - I am closed for modification");
    }
}
