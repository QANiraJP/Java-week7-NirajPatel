package javaweek7;
/*
    /*
    1. Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :
     */

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String output;
        System.out.println("Enter any number:");
        a=sc.nextInt();
        output = a % 2 == 0 ? "EVEN" : "ODD";
        System.out.println("Entered Number is " +output);
    }

}
