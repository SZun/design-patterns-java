package com.zun;

public interface Observer {

    void update();

    void setSubject(Subject sub);

}

class MyTopicSubscriber implements Observer {

    private final String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        String res = msg == null ? name + ":: No new message" : name + ":: Consuming message " + msg;
        System.out.println(res);
    }

    @Override
    public void setSubject(Subject sub) {
        topic = sub;
    }
}