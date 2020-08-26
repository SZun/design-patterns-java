package com.zun;

interface IReceiver {

    boolean processMessage(Message msg);
    void setNextChain(IReceiver nextChain);

}

class FaxErrorHandler implements IReceiver {

    private IReceiver nextReceiver;

    @Override
    public boolean processMessage(Message msg) {
        if(msg.text.contains("Fax")) {
            System.out.println("FaxErrorHandler processed " + msg.priority + " priority issue " + msg.text);
            return true;
        } else if(nextReceiver != null) nextReceiver.processMessage(msg);
        return false;
    }

    @Override
    public void setNextChain(IReceiver nextChain) {
        nextReceiver = nextChain;
    }
}

class EmailErrorHandler implements IReceiver {

    private IReceiver nextReceiver;

    @Override
    public boolean processMessage(Message msg) {
        if(msg.text.contains("Email")) {
            System.out.println("EmailErrorHandler processed " + msg.priority + " priority issue " + msg.text);
            return true;
        } else if(nextReceiver != null) nextReceiver.processMessage(msg);
        return false;
    }

    @Override
    public void setNextChain(IReceiver nextChain) {
        nextReceiver = nextChain;
    }
}
