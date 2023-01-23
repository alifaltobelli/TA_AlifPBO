package controller;

public abstract class Employee {
    private int salary, id;
    private float bonus;
    private String birthday;
    private String firstName, lastName, gender, department;
    private static int numberOfEmployees =0;
    String name;
    
    public Employee(String firstName, String lastName,int salary, String gender, String birthday, String department) {
        numberOfEmployees++;
        this.id = numberOfEmployees;
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = firstName + lastName;
        this.salary = salary;
        this.gender = gender;
        this.birthday = birthday;
        this.department = department;
        
        
                
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + ", id=" + id + ", birthday=" + birthday + ", gender=" + gender + ", department=" + department + ", numberOfEmployees=" + numberOfEmployees + ", name=" + name + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
            
}
