package com.zun;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    ChatMediator mediator = new ChatMediatorImpl();

        UserImpl jason = new UserImpl(mediator, "Jason");
        UserImpl jennifer = new UserImpl(mediator, "Jennifer");
        UserImpl lucy = new UserImpl(mediator, "Lucy");
        UserImpl ian = new UserImpl(mediator, "Ian");

        Arrays.asList(jason, jennifer, lucy, ian).forEach(mediator::addUser);

        jason.send("Hi all");

    }
}
