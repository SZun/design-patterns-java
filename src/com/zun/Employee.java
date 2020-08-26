package com.zun;

interface Employee {
    void showEmployeeDetails();
}

class Developer implements Employee {

    private final String name;
    private final long empId;
    private final String position;

    public Developer(long empId, String name, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}

class Manager implements Employee {

    private final String name;
    private final long empId;
    private final String position;

    public Manager(long empId, String name, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}
