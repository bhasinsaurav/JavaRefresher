package com.refresher;

public class notes {

    //String buffer and string builder
    //String buffer is the mutable string which gives the buffer size of 16 which we can get from method .capacity().
    // The difference between string buffer and string buider is stringbuilder is thread safe and string buffer is not
    //Static Keyword
    //Static makes the variable common to all the objects which we can access in a statio way.
    //We can use static variable in non static method but we cannot use non static variable in static methods directly.
    // We can use it in static methods but passing an object as parameter
    // There is also static block which gets called when you make object but unlike constructor it only gets called during the creation of first object .
    // There is a class loader in JVM which loads the class from the library . So it first calls the static block at the time of class loading and then constructor .
    // Irrespective of number of objects class is loaded only once.
    // If we want to load the class without creating object we can use Class class and use forName method to load the class
    // Only inner class could be static not outer class
    /**
     * Final Keyword
     * to make a variable constant we use final variable
     * To make a class non inhereted so that no class can extend we make the class final
     * To stop method overriding , we make the method final
     */
    /**
     * Object class
     * Every class in java extends the object class
     * so when we call an object without anything , it executes the toString methods of an Object class and we can override the toString method and the overriden method will be called itself.
     */
    /*
    * Inner class
    * Annonymous inner class is created at the time of method creation and when we compile it creates a different .class for that inner class
     */
    /**
     * Enums
     * They are named constants
     * you cannot extend enum but other than that enum can do everything a class do because it extends the enum class.
     */

    /**
     * Annotations
     * We use annotations when we want to interact with compiler and tell the compiler something
     * We can show our intentions with the help of annotation
     */
    /**
     * The interface with only one method is called functional interface
     * We can use @FunctionalInterface annotation to let compiler know that it is functional interface
     */
    /**
     * Lambda Expression in Java
     *
     * - Makes Java code less verbose (more concise).
     * - Can only be used with Functional Interfaces (interfaces with exactly one abstract method).
     *
     * Instead of writing:
     *
     * A obj = new A() {
     *     public void show() {
     *         System.out.println("this is show");
     *     }
     * };
     *
     * We can simply write using a Lambda Expression:
     *
     * A obj = () -> {
     *     System.out.println("this is show");
     * };
     *
     * Here:
     * - 'A' is a Functional Interface.
     * - The compiler automatically infers the method to implement.
     * - It is syntactic sugar over anonymous inner classes.
     */

    /**
     * Types of Interfaces
     * 1. Normal , 2. Functional / SAM , 3. Marker
     * Normal - Interface with 2 or more methods
     * Functional / SAM - SAM stands for Single Abstract Method which mean their is only single abstract method
     * Marker - An interface with no method. It is used to update something to the compiler for example give permission for serialization .
     */
}

