package com.zun;

public class Main {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("jasonfiend.org");
            internet.connectTo("whatever.com");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
