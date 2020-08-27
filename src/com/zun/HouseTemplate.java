package com.zun;

abstract class HouseTemplate {

    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();

        System.out.println("House is built");
    }

    private void buildWindows(){
        System.out.println("Building glass windows");
    }

    private void buildFoundation(){
        System.out.println("Building foundation with cement, iron rods and sand");
    }

    public abstract void buildWalls();
    public abstract void buildPillars();

}

class WoodenHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building pillars with wood coating");
    }
}

class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building pillars with glass coating");
    }
}
