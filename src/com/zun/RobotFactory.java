package com.zun;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    private Map<String, IRobot> shapes = new HashMap<>();

    public int totalObjects() {
        return shapes.size();
    }

    public IRobot getRobot(String robotType) {
        IRobot toReturn = null;

        if (shapes.containsKey(robotType)) toReturn = shapes.get(robotType);
        else {
            switch (robotType){
                case "King":
                    System.out.println("We don't have a King robot, so we'll create one");
                    toReturn = new Robot("King");
                    shapes.put("King", toReturn);
                    break;
                case "Queen":
                    System.out.println("We don't have a Queen robot, so we'll create one");
                    toReturn = new Robot("Queen");
                    shapes.put("Queen", toReturn);
                    break;
                default:
                    break;
            }
        }

        return toReturn;
    }

}
