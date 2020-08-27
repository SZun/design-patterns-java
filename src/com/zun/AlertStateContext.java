package com.zun;

public class AlertStateContext {

    private MobileAlertState currentState = new Vibration();

    public void alert(){
        currentState.alert();
    }

    public void setCurrentState(MobileAlertState currentState) {
        this.currentState = currentState;
    }
}
