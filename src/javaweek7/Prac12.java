package javaweek7;

import java.util.Scanner;


/*
Write a program that tells us input value is number or an alphabet or symbol
 */
public class Prac12 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        input();
    }
    public static void input(){
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter any input:");
        char c=0;
        c=abc.next().charAt(0);



        if(c>='0' && c<= '9' ){
            System.out.println(c+" is a Digit.");
        }
        else if (c>='a' && c<='z'){
            System.out.println(c+" is a Character.");
        }
        else {
            System.out.println(c+" is a symbol.");
        }
    }
}
