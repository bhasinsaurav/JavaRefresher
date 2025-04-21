package com.refresher.arrays;

public class arrays {

    // Data structure to use when using same types , fixed size contents

    public static void main(String[] args) {

        int[] a = new int[5];  // a is reference and stored on stack and new int[5] is object which is stored in heap
        //[0,0,0,0,0]
        System.out.println(a[1]);
        a[1]=55;
        System.out.println(a[1]);
     }
}
