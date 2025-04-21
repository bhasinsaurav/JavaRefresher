package com.refresher.datatypes;

public class primitive {

    public static void main(String[] args){

        //Integer
        byte a = Byte.MAX_VALUE;  // 1 byte
        short b = Short.MAX_VALUE;  // 2 bytes
        int c = Integer.MAX_VALUE; // 4 bytes
        long d= Long.MAX_VALUE;  //8 bytes


        System.out.println("Max bytes= " + a);
        System.out.println("Max short= " + b);
        System.out.println("Max int= " + c);
        System.out.println("Max long= " + d);

        //Decimal
        float e = Float.MAX_VALUE; // 4 bytes stores 7 significant digits
        double f = Double.MAX_VALUE; // 8 bytes stores 15 significant digits

        System.out.println("Max float= "+ e);
        System.out.println("Max double= "+ f);

        //boolean
        boolean isAdult = true; // boolean can hold only 2 values true or false and can only takes 1 bit
        boolean isNotAdult = false;

        System.out.println(isAdult);
        System.out.println(isNotAdult);
        //char
        char character = 'c'; //Takes up 2 bytes , Its range is 0-65535 in which from 0-127 contains ascii characters
        System.out.println(character);


        // There is also a concept of widening conversion or implicit conversion in which , low value could be converted to other datatype with high or equal container size
        // Opposite of widening conversion is narrowing conversion or explicit conversion in which we have to explicitly tell the system to convert to other datatype regardless of the loss.
         
    }
}
