package com.zun;

abstract class AbstractDecorator extends Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    public void doJob(){
        if(component != null) component.doJob();
    }
}

class ConcreteDecorator1 extends AbstractDecorator {

    public void doJob(){
        super.doJob();
        System.out.println("I am from ConcreteDecorator1");
    }

}

class ConcreteDecorator2 extends AbstractDecorator {

    public void doJob(){
        super.doJob();
        System.out.println("I am from ConcreteDecorator2");
    }

}
