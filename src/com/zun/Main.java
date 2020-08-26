package com.zun;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        RobotFactory robotFactory = new RobotFactory();
        IRobot shape = null;

        for(int i = 0; i < 3; i++){
            shape = robotFactory.getRobot("King");
            shape.setColor(getRandomColor());
            shape.print();
        }

        for(int i = 0; i < 3; i++){
            shape = robotFactory.getRobot("Queen");
            shape.setColor(getRandomColor());
            shape.print();
        }

        System.out.println("Total robot objs: " + robotFactory.totalObjects());
    }

    private static String getRandomColor(){
        return new Random().nextInt(20) % 2 == 0 ? "red" : "green";
    }
}
