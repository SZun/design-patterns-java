package com.zun;

interface Player {

    void assignWeapon(String weapon);

    void mission();

}

class Terrorist implements Player {

    private final String TASK = "Plant a bomb";
    private String weapon;

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + " : Task is " + TASK);
    }
}

class CounterTerrorist implements Player {

    private final String TASK = "Diffuse a bomb";
    private String weapon;

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon " + weapon + " : Task is " + TASK);
    }
}
