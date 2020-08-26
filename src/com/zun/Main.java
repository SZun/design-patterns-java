package com.zun;

public class Main {

    public static void main(String[] args) {

        RobotFactory robotFactory = new RobotFactory();

        Robot shape = robotFactory.getRobot("small");
        shape.print();

        for(int i = 0; i < 2; i++){
            shape = robotFactory.getRobot("small");
            shape.print();
        }

        int numTotalObjsCreated = robotFactory.totalObjects();
        System.out.println("Total robots created = " + numTotalObjsCreated);

        for(int i = 0; i < 2; i++){
            shape = robotFactory.getRobot("large");
            shape.print();
        }

        numTotalObjsCreated = robotFactory.totalObjects();
        System.out.println("Total robots created = " + numTotalObjsCreated);
    }
}
