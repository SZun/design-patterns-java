package com.zun;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    private Map<String, Robot> shapes = new HashMap<>();

    public int totalObjects() {
        return shapes.size();
    }

    public Robot getRobot(String robotType) {
        Robot toReturn = null;

        if (shapes.containsKey(robotType)) toReturn = shapes.get(robotType);
        else {
            switch (robotType){
                case "small":
                    toReturn = new SmallRobot();
                    shapes.put("small", toReturn);
                    break;
                case "large":
                    toReturn = new LargeRobot();
                    shapes.put("large", toReturn);
                    break;
                default:
                    break;
            }
        }

        return toReturn;
    }

}
