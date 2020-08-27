package com.zun;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyTopic topic = new MyTopic();

        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");

        List<Observer> observers = Arrays.asList(obj1, obj2, obj3);
        observers.forEach(topic::register);
        observers.forEach(i -> i.setSubject(topic));

        obj1.update();

        topic.postMessage("New MSG");
    }
}
