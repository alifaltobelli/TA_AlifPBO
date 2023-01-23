package entity;

import controller.Employee;

public class Technician extends Employee {
 
    public Technician(String fName, String lName, int salary, String dep, String birth,String department) {
        super(fName, lName, salary, dep, birth, department);
    }
    public static double technicianBonusCalculator(int salary) {
        double bonus = salary * 0.05;
        return bonus;
    }
}
