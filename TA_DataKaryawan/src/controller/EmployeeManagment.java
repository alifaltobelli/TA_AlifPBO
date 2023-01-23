package controller;
import controller.Employee;
import controller.Employee;
import entity.Manager;
import entity.Secretary;
import entity.Technician;
import entity.Programmer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeManagment {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employeeList = new ArrayList<>();
   

    public static void registerEmployee() {
        System.out.println("Nama depan karyawan baru?");
        String firstName = sc.nextLine();
        System.out.println("Nama belakang karyawan?");
        String lastName = sc.nextLine();
        System.out.println("Gaji pegawai baru?");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.println("Apa jenis kelamin yang dimiliki karyawan?");
        String gender = sc.nextLine();
        System.out.println("Tanggal lahir karyawan baru? (YY/MM/DD)");
        String birthday = sc.nextLine();
        System.out.println("Departemen yang mana?");
        System.out.println("1:Managment");
        System.out.println("2:Development");
        int department = sc.nextInt();
        sc.nextLine();
        if (department == 1) {
            System.out.println("Apakah karyawan baru 1:Sekretaris atau 2:Manajer?");
            int mChoice = sc.nextInt();
            sc.nextLine();
            String departmentName = "Managment";
            if (mChoice == 1) {
                Secretary s = new Secretary(firstName, lastName, salary, gender, birthday, departmentName);
                employeeList.add(s);
                System.out.println("Sekretaris dibuat");
            } else if (mChoice == 2) {
                Manager m = new Manager(firstName, lastName, salary, gender, birthday, departmentName);
                employeeList.add(m);
                System.out.println("Manajer dibuat");
            } else {
                System.out.println("Pilihan tidak valid.");
            }

        } else if (department == 2) {
            System.out.println("Apakah karyawan baru 1:Teknisi atau 2:Programmer?");
            int dChoice = sc.nextInt();
            sc.nextLine();
            String departmentName = "Development";
            if (dChoice == 1) {
                Technician t = new Technician(firstName, lastName, salary, gender, birthday, departmentName);
                employeeList.add(t);
                System.out.println("Teknisi dibuat");
            } else if (dChoice == 2) {
                Programmer p = new Programmer(firstName, lastName, salary, gender, birthday, departmentName);
                employeeList.add(p);
                System.out.println("Pemrogram dibuat");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

    }

    public static void deleteEmployee() {
        System.out.println("ID karyawan yang akan diberhentikan:");
        int delete = sc.nextInt();
        sc.nextLine();
        Iterator<Employee> b = employeeList.iterator();
        while(b.hasNext()) {
            if(b.next().getId() == delete){
                b.remove();
                int update = Employee.getNumberOfEmployees();
                Employee.setNumberOfEmployees(--update);
                System.out.println("Karyawan dipecat");
            }
        }
//        for (Employee employee : employeeList) {
//            if(employee.getId() == delete) {
//                employeeList.remove(employee);
//                System.out.println("Employee is fired");    
//            }else {
//                System.out.println("");
//            }
//        }
 {
            
        }
    }

    public static void updateName() {
        System.out.println("ID karyawan yang akan diperbarui:");
        int rename = sc.nextInt();
        sc.nextLine();
        for (Employee employee1 : employeeList) {
            if(employee1.getId() == rename) {
                System.out.println("Nama depan baru?");
                String fn = sc.nextLine();
                System.out.println("Nama belakang baru?");
                String ln = sc.nextLine();
                employee1.setName(fn + ln);
//                employee1.setFirstName(fn);
//                employee1.setLastName(ln);
                System.out.println("Nama karyawan diperbarui.");
            }else {
                System.out.println("Karyawan tidak ditemukan.");
            }
        }
    }

    public static void updateBirth() {
        System.out.println("ID karyawan yang akan diperbarui:");
        int newBirth = sc.nextInt();
        sc.nextLine();
        for (Employee employee1 : employeeList) {
            if(employee1.getId() == newBirth) {
                System.out.println("Tanggal lahir baru?");
                String birth = sc.nextLine();
                employee1.setBirthday(birth);
                System.out.println("Ulang tahun diperbarui.");
            }
        }
    }
    public static void updateDepartment() {
         System.out.println("ID karyawan yang akan diperbarui:");
        int newDep = sc.nextInt();
        sc.nextLine();
        for (Employee employee1 : employeeList) {
            if(employee1.getId() == newDep) {
                System.out.println("Departemen baru?");
                String department = sc.nextLine();
                if(department.equals( "Managment")) {
                employee1.setDepartment("Managment");
            }else
                    employee1.setDepartment("Development");
            }System.out.println("Departemen karyawan diperbarui");
        }
    }

    public static void updateSalary() {
        System.out.println("ID karyawan yang akan diperbarui:");
        int newSalary = sc.nextInt();
        sc.nextLine();
        for (Employee employee1 : employeeList) {
            if(employee1.getId() == newSalary) {
                System.out.println("Gaji Baru?");
                int salary = sc.nextInt();
                sc.nextLine();
                employee1.setSalary(salary);
                System.out.println("Gaji diperbarui.");
            }
        }
    }

    public static  void searchName() {
        System.out.println("Nama karyawan?");
        String fullName = sc.nextLine();
        
        int idx = fullName.lastIndexOf(' ');
        if(idx == -1) 
            throw new IllegalArgumentException("Hanya satu nama" + fullName);
            String firstName = fullName.substring(0, idx);
            String surName = fullName.substring(idx + 1);
        
        
        for (Employee employee : employeeList) {
            if((employee.getFirstName().equalsIgnoreCase(firstName)) && (employee.getLastName().equalsIgnoreCase(surName))) {
            
                System.out.println(employee);
            }else
                System.out.println("Karyawan tidak ditemukan");
            
        }
    }

    public static void searchId() {
        System.out.println("ID pada karyawan?");
        int findId = sc.nextInt();
        sc.nextLine();
        for (Employee employee : employeeList) {
            if(employee.getId() == findId) {
                System.out.println(employee);
            }else {
                System.out.println("Karyawan tidak ditemukan");
            }
        }
    }

    public static void searchByDepartment() {
        System.out.println("Witch department ( Managment / Development)?");
        String findDepartment = sc.nextLine();
       
        for (Employee employee : employeeList) {
            if(employee.getDepartment().equals(findDepartment)) {
                System.out.println(employee);
            }else {
                System.out.println("Department not found");
            }
        }
    }

    public static void printEmployees() {
        for (Employee employee : employeeList) {
            
            if (employee instanceof Manager) {
                System.out.println(employee + " Manager");
                
            } else if (employee instanceof Programmer) {
                System.out.println(employee + " Programmer");
            }
            if (employee instanceof Secretary) {
                  System.out.println(employee + " Secretary");
            }
            if (employee instanceof Technician) {
                  System.out.println(employee + "  Technician");
            }
        }

    
    }

}
