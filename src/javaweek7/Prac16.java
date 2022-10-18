package javaweek7;

import java.util.Scanner;

/*
Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
 */
public class Prac16 {

    public static void main(String[] args) {
    number();
    }

    public static void number(){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        a=sc.nextInt();
        if(a>0){
            System.out.println("Number is Positive");
        } else if (a<0) {
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is Zero");
        }


    }
}
