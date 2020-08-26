package com.zun;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {

    private final String name;
    private final String department;

    private List<Faculty> facultyList = new ArrayList<>();

    public Supervisor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void add(Faculty prof){
        facultyList.add(prof);
    }

    public void remove(Faculty prof){
        facultyList.remove(prof);
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }

    @Override
    public String getDetails() {
        return name + " is the " + department;
    }
}
