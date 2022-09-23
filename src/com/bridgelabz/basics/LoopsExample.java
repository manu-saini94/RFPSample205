package com.bridgelabz.basics;

public class LoopsExample {

    // Loops => used for iteration
    // repeat the code based on some condition


    public static void main(String[] args) {
        // x++ post increment
        // ++x pre increment
        // x-- post decrement
        // --x pre decrement

        // they will increase or decrease the value by 1

//        int x = 2;
//        System.out.println(x);
//        int y = ++x;
//        System.out.println(y);
//        System.out.println(x);
//        System.out.println(x);

        int x = 2;
        int sum1 = x++ + ++x;
        int sum = x++ + ++x + x++ + x++ + ++x; // 2 + 4 + 4 + 5 +7 = 22
        System.out.println(sum);
        System.out.println(x);


    }
}
