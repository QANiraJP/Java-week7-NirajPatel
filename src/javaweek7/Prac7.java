package javaweek7;
/*
    Finding sales Commision
 */

import java.util.Scanner;

public class Prac7 {
    static int salesID,salesAmount,basicSalary;
    static double commission;
    static String sellersname;
    public static void main(String[] args) {
    info();
    }

    public static void info(){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Sales ID:");
        salesID=sc.nextInt();
        System.out.print("Enter Seller's Name: ");
        sellersname=sc.next();
        System.out.print("Enter sales amount: ");
        salesAmount=sc.nextInt();
        System.out.print("Enter Basic Salary: ");
        basicSalary=sc.nextInt();


        if (salesAmount>= 50000)
        {
            commission = (salesAmount * 35)/100;
            System.out.println("Salers's commision is :" +commission);
        } else if (salesAmount >= 30000)
        {
            commission = (salesAmount * 20)/100;
            System.out.println("Salers's commision is :" +commission);
        }else if (salesAmount >= 20000)
        {
            commission = (salesAmount * 10)/100;
            System.out.println("Salers's commision is :" +commission);
        }else if (salesAmount >= 10000)
        {
            commission = (salesAmount * 5)/100;
            System.out.println("Salers's commision is :" +commission);
        }else {
            commission = (salesAmount*2)/100;
            System.out.println("Salers's commision is :" +commission);
        }

    }
}
