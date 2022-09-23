package com.bridgelabz.basics;

import java.util.Scanner;

public class SwitchExample {

    static void m2(char x) {

        switch (x){
            case 'A':
                System.out.println("first case");
                break;
            case 'B':
                System.out.println("second case");
                break;
            case 'C':
                System.out.println("third case");
                break;
            default:
                System.out.println("default");
        }

    }



    public static void main(String[] args) {

        System.out.println("main method");
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter choice(A-Z)");
        char ch = scan.next().charAt(0);
        m2(ch);

    }
}
