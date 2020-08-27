package com.zun;

import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {

    void sendMessage(String msg, User user);
    void addUser(User user);

}

class ChatMediatorImpl implements ChatMediator{

    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String msg, User user) {
        users.forEach(u -> {
            if(u != user) u.receive(msg);
        });
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
