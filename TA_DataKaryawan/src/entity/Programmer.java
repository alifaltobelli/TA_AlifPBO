package entity;

import controller.Employee;

public class Programmer extends Employee {
     
    public Programmer(String fName, String lName, int salary, String dep, String birth,String department) {
        super(fName, lName, salary, dep, birth, department);
    }
    public static double programmerBonusCalculator(int salary) {
        double bonus = salary * 0.15;
        return bonus;
    }
}

