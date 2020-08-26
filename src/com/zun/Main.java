package com.zun;

import java.util.Currency;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IReceiver  emailHandler = new EmailErrorHandler();
        IReceiver  faxHandler = new FaxErrorHandler();

        faxHandler.setNextChain(emailHandler);

        IssueRaiser issueRaiser = new IssueRaiser(faxHandler);

        Message message1 = new Message("Fax late", MessagePriority.NORMAL);
        Message message2 = new Message("Email no work", MessagePriority.HIGH);
        Message message3 = new Message("In Email field not there", MessagePriority.NORMAL);
        Message message4 = new Message("Fax not reaching destination", MessagePriority.HIGH);

        issueRaiser.raiseMessage(message1);
        issueRaiser.raiseMessage(message2);
        issueRaiser.raiseMessage(message3);
        issueRaiser.raiseMessage(message4);

    }
}
