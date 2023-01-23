package entity;

import controller.Employee;

public class Manager extends Employee {

    public Manager(String fName, String lName, int salary, String dep, String birth,String department) {
        super(fName, lName, salary, dep, birth, department);
    }
    public static double managerBonusCalculator(int salary) {
        double bonus = salary * 0.10;
        return bonus;
    }
}
