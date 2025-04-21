package com.refresher.datatypes;

public class bitwiseOperator {

    // There are different bitwise operators in java
    //1. & --> Bitwise AND
    //2.| --> Bitwise OR
    //3. ^ --> XOR OPERATOR
    //4. ! -->NOT operator (~)
    //5. << --> Left Shift (<<)
    //6. >> --> Right Shift(>>)
    public static void main(String[] args) {
        int a = 5; //0101
        int b = 3; //0011

        //AND operator (&)
        System.out.println("5 & 3= " + (a&b));

        //OR operator (|)
        System.out.println("5 | 3= " + (a|b));

        //XOR operator (^)
        System.out.println("5 ^ 3= " + (a^b));

        //NOT operator (~)
        System.out.println("~5 = " + (~5));
        System.out.println(Integer.toBinaryString(5) + "and " + Integer.toBinaryString(~5));

        // Left Shift (<<)
        System.out.println("5<<1= " + (5<<1));

        //Right Shift (>>)
        System.out.println("5>>1= " + (5>>1));

    }

}
