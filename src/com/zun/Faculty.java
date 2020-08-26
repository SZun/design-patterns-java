package com.zun;

interface Faculty {

    String getDetails();

}

class Professor implements Faculty {

    private final String name;
    private final String position;
    private final int officeNum;

    public Professor(String name, String position, int officeNum) {
        this.name = name;
        this.position = position;
        this.officeNum = officeNum;
    }

    @Override
    public String getDetails() {
        return name + " is the " + position;
    }
}
