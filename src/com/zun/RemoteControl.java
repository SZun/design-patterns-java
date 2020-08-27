package com.zun;

import java.rmi.Remote;

interface RemoteControl {

    void pressSwitch(TV context);

}

class On implements RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already On. Going off now");
        context.setState(new Off());
    }
}

class Off implements RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am Off. Going on now");
        context.setState(new On());
    }
}
