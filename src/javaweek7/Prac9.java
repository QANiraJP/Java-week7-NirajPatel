package javaweek7;

import java.util.Scanner;

public class Prac9 {


    public static void main(String[] args) {
        cityname();
    }

    public static void cityname() {


        char city ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any letter between A to F:");
        city = sc.next().charAt(0);
        switch (city) {
            case 'a':
                System.out.println("Ahmedabad");
                break;
            case 'b':
                System.out.println("Baroda");
                break;
            case 'c':
                System.out.println("Chennai");
                break;
            case 'd':
                System.out.println("Delhi");
                break;
            case 'e':
                System.out.println("Essex");
                break;
            case 'f':
                System.out.println("Faridabad");
                break;
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Baroda");
                break;
            case 'C':
                System.out.println("Chennai");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Essex");
                break;
            case 'F':
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");


        }


    }
}
