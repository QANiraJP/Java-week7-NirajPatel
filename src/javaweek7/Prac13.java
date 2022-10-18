package javaweek7;

import java.util.Scanner;

public class Prac13 {

    public static void main(String[] args) {
        week();
    }

    public static void week(){
        int a = 7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit from 1 to 7 :");
        a=sc.nextInt();
         switch (a){
             case 1:
                 System.out.println("Monday");
                 break;
             case 2:
                 System.out.println("Tuesdsy");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             case 7:
                 System.out.println("Sunday");
                 break;
             case 8:
                 System.out.println("Week contains 1 to 7 days");
                 break;

         }

    }
}
