package com.zun;

public class Main {

    public static void main(String[] args) {
        Developer developer1 = new Developer(100, "Jason Fedin", "Pro Dev");
        Developer developer2 = new Developer(101, "Myra Fedin", "Jr Dev");

        Manager engDirectory = new Manager("Mike", 25000);
        engDirectory.addEmployee(developer1);
        engDirectory.addEmployee(developer2);

        Developer developer3 = new Developer(103, "Tom", "Dev");

        Manager genManager = new Manager("Mark", 50000);

        genManager.addEmployee(developer3);
        genManager.addEmployee(engDirectory);

        genManager.showEmployeeDetails();
    }
}
