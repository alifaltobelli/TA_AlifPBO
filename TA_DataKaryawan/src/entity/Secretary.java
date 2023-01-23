package entity;

import controller.Employee;

public class Secretary extends Employee {
    
    public Secretary(String fName, String lName, int salary, String dep, String birth,String department) {
        super(fName, lName, salary, dep, birth, department);
    }
    public static double secretaryBonusCalculator(int salary) {
        double bonus = salary * 0.07;
   
        return bonus;
    }
}