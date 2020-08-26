package com.zun;

public class Main {

    public static void main(String[] args) {
        Developer developer1 = new Developer(100, "Jason Fedin", "Pro Dev");
        Developer developer2 = new Developer(101, "Myra Fedin", "Jr Dev");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(developer1);
        engDirectory.addEmployee(developer2);

        Employee man1 = new Manager(200, "Jennifer Fedin", "SEO Manager");
        Employee man2 = new Manager(201, "Ian Fedin", "Myra's Manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory compDirectory = new Directory();
        compDirectory.addEmployee(engDirectory);
        compDirectory.addEmployee(accDirectory);

        compDirectory.showEmployeeDetails();
    }
}
