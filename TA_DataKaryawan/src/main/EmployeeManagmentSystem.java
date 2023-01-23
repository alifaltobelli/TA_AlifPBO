package main;
import java.util.*;
import controller.EmployeeManagment;
import controller.Login;
import entity.Manager;
import entity.Secretary;
import entity.Technician;
import entity.Programmer;


import java.util.Scanner;
public class EmployeeManagmentSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login masuk = new Login();
        fakeDataBase();
                boolean loop = true;

        String usr , pas;
        System.out.println("Login");
        System.out.print("Masukan Username : ");
        usr = sc.nextLine();
        System.out.print("Masukan Password: ");
        pas = sc.nextLine();
    
        if(usr.equals(masuk.getUsername()) && pas.equals(masuk.getPass()))
        {
            System.out.println("Sukses");
        }else {
            System.out.println("Nama pengguna atau kata sandi input tidak valid");
        }
        while(loop) {
              System.out.println("Selamat datang di Employee Management System (edisi Proffs).");
            System.out.println("Apa yang ingin kamu lakukan/lihat?");
            System.out.println("1: Manajemen karyawan");
            System.out.println("2: Statistik karyawan");
            System.out.println("0: Keluar dari program.");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    EmployeeManagmentMenu.employeeManagmentMenu();
                    break;
                case 2:
                    EmployeeStatisticsMenu.employeeStatisticsMenu();
                    break;
                default:
                    System.out.println("Masukan tidak valid. Silakan coba lagi");
                    break;
            }
        }
        if(loop == false) {
            System.out.println("Terima kasih telah menggunakan Employee Managment System (edisi Proffs).");
        }
    }

    private static void fakeDataBase() {
        Manager m = new Manager("Kalle", "Kula", 18000, "Male", "83-05-28", "Managment");
        Manager m2 = new Manager("Mattias", "Beer", 15000, "Female", "82-06-06", "Managment");
        Programmer p = new Programmer("Cheryl", "Stål", 39000, "male", "78-03-11", "Development");
        Technician t = new Technician("Karin", "Kantakoski", 29000, "Female", "91-09-29", "Development");
        Secretary s = new Secretary("Lisa", "Svensson", 20000, "female", "91-10-19", "Managment");
       
        // EmployeeManagment.employeeList.add(m);
       // EmployeeManagment.employeeList.add(m2);
        //EmployeeManagment.employeeList.add(s);
        //EmployeeManagment.employeeList.add(p);
        //EmployeeManagment.employeeList.add(t);
        
    }
 
}
