package main;
import controller.EmployeeManagment;
import java.util.Scanner;

public class EmployeeManagmentMenu {

    static Scanner sc = new Scanner(System.in);
    
    public static int choice1;
    

    public static void employeeManagmentMenu() {
        boolean loop1 = true;
        while (loop1) {
            System.out.println("1: Daftar karyawan baru");
            System.out.println("2: Petugas pemadam kebakaran");
            System.out.println("3: Perbarui nama pada karyawan");
            System.out.println("4: Perbarui tanggal lahir karyawan");
            System.out.println("5: Perbarui departemen karyawan");
            System.out.println("6: Perbarui gaji karyawan");
            System.out.println("7: Cari karyawan berdasarkan nama");
            System.out.println("8: Search employee by id");
            System.out.println("9: Cari karyawan berdasarkan departemen");
            System.out.println("10: Tampilkan semua karyawan");
            System.out.println("0: Kembali ke menu utama");
            int choice1 = sc.nextInt();
            sc.nextLine();

            switch (choice1) {
                case 0:
                    loop1 = false;
                    break;
                case 1:
                    EmployeeManagment.registerEmployee();
                    break;
                case 2:
                    EmployeeManagment.deleteEmployee();
                    break;
                case 3:
                    EmployeeManagment.updateName();
                    break;
                case 4:
                    EmployeeManagment.updateBirth();
                    break;
                case 5:
                    EmployeeManagment.updateDepartment();
                    break;
                case 6:
                    EmployeeManagment.updateSalary();
                    break;
                case 7:
                    try{
                    EmployeeManagment.searchName();
                    }catch(IllegalArgumentException e){ 
                        System.out.println("Silakan isi nama lengkap orang tersebut.");
                    EmployeeManagment.searchName();
                            
                    }
                    
                    break;
                case 8:
                    EmployeeManagment.searchId();
                    break;
                case 9:
                    EmployeeManagment.searchByDepartment();
                    break;
                case 10:
                    EmployeeManagment.printEmployees();
                    break;
            }

        }
    }
}
