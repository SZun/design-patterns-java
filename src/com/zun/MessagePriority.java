package com.zun;

enum MessagePriority {

    NORMAL,
    HIGH

}

class Message {
    public String text;
    public MessagePriority priority;

    public Message(String text, MessagePriority priority) {
        this.text = text;
        this.priority = priority;
    }


}
