package com.zun;

import java.util.Random;

public class Main {

    private static String[] playerTypes = {"Terrorist", "Counter Terrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static void main(String[] args) {
        int i = 0;
        while(i < 10){
            Player p = PlayerFactory.getPlayer(getRandPlayer());
            p.assignWeapon(getRandWeapon());
            p.mission();
            i++;
        }

    }

    private static String getRandPlayer(){
        return playerTypes[new Random().nextInt(playerTypes.length)];
    }

    private static String getRandWeapon(){
        return weapons[new Random().nextInt(weapons.length)];
    }
}
