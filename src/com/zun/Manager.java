package com.zun;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private List<Employee> employeeList = new ArrayList<>();
    private final String name;
    private final double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name = " + name);
        System.out.println("Salary = $" + salary + ".00");
        employeeList.forEach(Employee::showEmployeeDetails);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee getChild(int i){
        return employeeList.get(i);
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }
}
