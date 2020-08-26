package com.zun;

public class IssueRaiser {

    private final IReceiver firstReceiver;

    public IssueRaiser(IReceiver firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    public void raiseMessage(Message msg){
        if(firstReceiver != null) firstReceiver.processMessage(msg);
    }
}
