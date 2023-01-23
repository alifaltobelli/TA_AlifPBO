package main;
import controller.EmployeeStatistics;
import java.util.Scanner;


public class EmployeeStatisticsMenu {
    static Scanner sc = new Scanner(System.in);
    
    public static int choice2;
    
    public static void employeeStatisticsMenu(){
         boolean loop2 = true;
        while(loop2){
           
            System.out.println("1: Gaji rata-rata di perusahaan");
            System.out.println("2: Gaji tertinggi di perusahaan");
            System.out.println("3: Gaji terendah di perusahaan");
            System.out.println("4: Total bonus");
            System.out.println("5: Wanita dalam persentase di perusahaan");
            System.out.println("6: Persentase pria dari berbagai kategori peran kerja");
            System.out.println("0: Kembali ke menu utama");
            int choice1 = sc.nextInt();
            sc.nextLine();
            
            switch (choice1) {
                case 0: 
                    loop2 = false;
                    break;
                case 1:
                    EmployeeStatistics.averageWage();
                    break;
                case 2:
                    EmployeeStatistics.maxSalary();
                    break;
                case 3:
                    EmployeeStatistics.minSalary();
                    break;
                case 4:
                    EmployeeStatistics.bonus();
                    EmployeeStatistics.bonusByEmploee();
                    
                    break;
                case 5:
                    EmployeeStatistics.perecentageWomen();
                    break;
                case 6:
                    EmployeeStatistics.menByDepartment();
                    break;
            }
            
    
        }
    }
}
