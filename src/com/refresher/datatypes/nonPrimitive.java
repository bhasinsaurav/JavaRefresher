package com.refresher.datatypes;

public class nonPrimitive {

    public static void main(String[] args) {
        // non primitive datatypes are basically objects that we create.
        // it could be String , Array , Classes, Interfaces or any other objects
        //when we use new keywork , that mean we are creating an object
        // jvm has a memory space to create a object which is a heap memory
        // primitive datatypes are stored in stack while non primiitve gets stored in heap
        //But when primitive data types are in the object , they gets stored in heap
        // reference of the heap memory items are stored in stack
        // There is a concept called string pool that saves the string literals which doesn't allocate a new memory for strings with same values and it is the reason why string is said to be immutable
        String s1 = "Hello"; // String literal
        String s2 = new String("Hello");// Using Constructor

        String s3 = "Hello";
        System.out.println( s1 == s3); //true (same reference in pool)
        System.out.println(s1==s2);  //false (different objects)
        System.out.println(s1.equals(s2)); //true (same context)
    }


}
