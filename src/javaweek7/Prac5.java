package javaweek7;

import java.util.Scanner;

public class Prac5 {

    static int employeeID,basicsalary;
    static String name;
    static float hra,da,ta,pf,grosssalary;
    static Scanner sc=new Scanner(System.in);


    public static void main(String[] args) {
        infoInput();
        salaryslip();
    }

    public static void infoInput(){
        System.out.print("Enter employee name: ");
        name=sc.nextLine();
        System.out.print("Enter employee id: ");
        employeeID=sc.nextInt();
        System.out.print("Enter employee's basic salary: ");
        basicsalary=sc.nextInt();
        hra = (basicsalary*10)/100f;
        da = (basicsalary*8)/100f;
        ta= (basicsalary*9)/100f;
        pf=(basicsalary*20)/100f;

        grosssalary= (basicsalary+hra+ta+da)-pf;

    }
    public static void salaryslip(){
        System.out.println("|---------------------------|");
        System.out.println("|        Salary Slip        |");
        System.out.println("|---------------------------|");
        System.out.println("|Employee Id  : " + employeeID + "         |");
        System.out.println("|Employee Name: " + name + "      |");
        System.out.println("|---------------------------|");
        System.out.println("|Basic Salary : " + basicsalary + "       |");
        System.out.println("|HRA 10%      : " + hra + "      |");
        System.out.println("|TA   8%      : " + ta + "      |");
        System.out.println("|DA   9%      : " + da + "      |");
        System.out.println("|PF(-20%)     : " + pf + "      |");
        System.out.println("|---------------------------|");
        System.out.println("|Gross Salary : " + grosssalary + "     |");
        System.out.println("|---------------------------|");
    }

}
