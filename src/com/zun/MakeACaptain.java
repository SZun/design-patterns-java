package com.zun;

public class MakeACaptain {

    private String captain;

    private MakeACaptain() {}

    private static class SingletonHelper {
        private static final MakeACaptain uniqueMakeACaptain = new MakeACaptain();

    }

    public static MakeACaptain getCaptain(){
        return SingletonHelper.uniqueMakeACaptain;
    }

    public static void main(String[] args) {
        System.out.println("Trying to make a captain for out team");

        MakeACaptain c1 = MakeACaptain.getCaptain();

        System.out.println("Trying to make another captain");

        MakeACaptain c2 = MakeACaptain.getCaptain();

        System.out.println("c1 && c2 are same instance == " + c1.equals(c2));
    }

}
