package javaweek7;

import java.util.Scanner;

/*
Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */
public class Prac2 {
    static int a;

    public static void main(String[] args) {
        leapYear();
    }
    public static void leapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Year :");
        int a = sc.nextInt();

        if(a%4 == 0){
            System.out.println("Entered year is a leap year");
        } else if (a%400 == 0) {
            System.out.println("Entered year is a leap year");
        }else if (a%100 != 0) {
            System.out.println("Entered year is  not a leap year");
        }
        else{
            System.out.println("Entered year is not a leap year");
        }
    }
}
