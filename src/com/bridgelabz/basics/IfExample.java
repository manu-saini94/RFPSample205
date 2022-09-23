package com.bridgelabz.basics;


import java.util.Scanner;

public class IfExample {


    // If we want to execute some code based on some conditions we will use if-else
    // if-else-if => If there are multiple conditions based on which you want to execute different code , we can use if-else-if


    static void m1(int v) {
        // even odd
        // == means comparing the two values
        if (v % 2 == 0) {
            System.out.println(v + " is even");
        } else {
            System.out.println(v + "  is odd");
        }
    }

    static void m2(int x) {

        if (x > 30) {
            System.out.println("x is greater than 30");
        } else if (x > 15 && x <= 30) {
            System.out.println("x is in range [16,30]");
        } else {
            System.out.println("x is lesser than equal to 15");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int y = scan.nextInt();
//        System.out.println("Enter a float value");
//        float z = scan.nextFloat();
        int x = 11;
        int var = 30;
//        // pass by value


        m2(var);

        m2(x);

        m2(24);

        m2(45);

        m1(y);


    }
}
