package com.zun;

public class Main {

    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        System.out.println(classAdapter.getInteger());
        ObjectAdapter objectAdapter = new ObjectAdapter(classAdapter);
        System.out.println(objectAdapter.getInteger());
    }
}
