package com.zun;

import java.util.HashMap;

public class PlayerFactory {

    private static HashMap<String, Player> hashMap = new HashMap<>();

    public static Player getPlayer(String type){
        Player p = null;

        if(hashMap.containsKey(type)) p = hashMap.get(type);
        else {
            switch(type){
                case "Terrorist":
                    System.out.println("Terrorist created");
                    p = new Terrorist();
                    break;
                case "Counter Terrorist":
                    System.out.println("Counter Terrorist created");
                    p = new CounterTerrorist();
                    break;
                default:
                    break;
            }
            hashMap.put(type, p);
        }

        return p;
    }

}
