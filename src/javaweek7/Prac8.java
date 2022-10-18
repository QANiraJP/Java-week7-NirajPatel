package javaweek7;

import java.util.Scanner;

public class Prac8 {
    static char city;

    public static void main(String[] args) {
        cityname();
    }
    public static void cityname(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any letter between A to F:");
        city = sc.next().charAt(0);
        if (city=='a' || city=='A'){
            System.out.println("Ahmedabad");
        } else if (city=='B' || city=='b'){
            System.out.println("Baroda");
        }else if (city=='C' || city=='c'){
            System.out.println("Chandigadh");
        }else if (city=='D' || city=='d'){
            System.out.println("Delhi");
        }else if (city=='E' || city=='e'){
            System.out.println("East London");
        }else if (city=='F' || city=='f'){
            System.out.println("Faridabad");}
        else {
             System.out.println("Invalid Entry");
            }
        }


    }

