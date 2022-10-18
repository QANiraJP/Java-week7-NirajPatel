package javaweek7;

import java.util.Arrays;

public class Prac17 {

    public static void main(String[] args) {

        int[]number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String[] str = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        System.out.println("Array of Numbers:");
        Arrays.sort(number);
        System.out.println("Sorted number array:" + Arrays.toString(number));


        System.out.println("Array of String:");
        Arrays.sort(str);
        System.out.println("Sorted number array:" + Arrays.toString(str));

    }
}
