package com.bridgelabz.basics;

public class VariableTypes {

    // 3 types
    // Local variable
    // static variable
    // instance variable

    // Local variable
    // Variables declared inside a method or a block is called local variable
    // If we are using the local variable , we must initialize it.
    // Local variable cannot be accessed outside a method or a block in which it is declared.



    static void m1() {
        int x = 9;
        float y = 0;
        System.out.println(x);
        System.out.println(y);

    }


    public static void main(String[] args) {
        int x = 9;
        System.out.println(x);
        m1();


    }
}
