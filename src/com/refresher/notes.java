package com.refresher;

public class notes {

    /**
     * StringBuffer and StringBuilder
     *
     * - Both are mutable classes used for modifying string content.
     * - StringBuffer is thread-safe (synchronized), suitable for multithreaded applications.
     * - StringBuilder is not thread-safe but offers better performance in single-threaded contexts.
     * - Both have a default capacity of 16 characters, accessible using the .capacity() method.
     */

/**
 * Static Keyword
 *
 * - The 'static' keyword makes methods or variables belong to the class, not specific objects.
 * - Static variables are shared among all instances of the class.
 * - Static methods can access static variables directly.
 * - Static methods cannot access non-static variables directly — but can do so via an object reference.
 */

/**
 * Static Block
 *
 * - A static block is executed once when the class is loaded into memory by the JVM.
 * - It runs before any object is created and before any constructor is called.
 * - No matter how many objects are created, the static block executes only once per class load.
 */

/**
 * Class Loading without Object Creation
 *
 * - A class can be loaded without creating an object using Class.forName("ClassName").
 * - This is commonly used in reflection and JDBC to load classes dynamically at runtime.
 */

/**
 * Static Inner Classes
 *
 * - Only nested (inner) classes can be declared static.
 * - Top-level (outer) classes cannot be static in Java.
 */
    /**
     * Final Keyword
     *
     * - The 'final' keyword is used to declare constants, prevent method overriding, and stop inheritance.
     * - A final variable cannot be reassigned after initialization.
     * - A final method cannot be overridden by subclasses.
     * - A final class cannot be extended (i.e., it cannot be subclassed).
     */

/**
 * Object Class
 *
 * - Every class in Java implicitly extends the Object class if no other superclass is specified.
 * - The Object class defines common methods like toString(), equals(), hashCode(), etc.
 * - When printing an object without overriding toString(), the default implementation from Object is used.
 * - You can override the toString() method to return a custom string representation.
 */

/**
 * Inner Classes
 *
 * - Inner classes are defined within another class.
 * - Anonymous inner classes are created at runtime, typically as implementations of interfaces or subclasses.
 * - When compiled, the Java compiler generates a separate .class file for each inner class.
 */

/**
 * Enums
 *
 * - Enums are special classes that represent a group of named constants.
 * - An enum implicitly extends the java.lang.Enum class and cannot extend any other class.
 * - Apart from not supporting inheritance, enums can have constructors, methods, and fields like regular classes.
 */


    /**
     * Annotations in Java:
     *
     * - Annotations are metadata used to provide information to the compiler, tools, or frameworks.
     * - They help communicate intentions (e.g., override a method, suppress a warning, mark as deprecated).
     * - Common examples include:
     *   @Override   → Indicates that a method overrides a superclass method.
     *   @Deprecated → Marks a method or class as outdated.
     *   @SuppressWarnings → Tells the compiler to ignore specific warnings.
     *
     * - Annotations do not directly affect program logic but can influence how the code is processed.
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

    /**
     * General Hierarchy of Exceptions in Java:
     *
     * Object
     *   ↳ Throwable
     *       ↳ Error        // Serious problems that applications should not try to handle
     *       ↳ Exception    // Conditions that applications might want to catch
     *
     * Exception Subtypes:
     * - Checked Exceptions (e.g., IOException, SQLException)
     *     → Must be either caught or declared using 'throws'
     * - Unchecked Exceptions (RuntimeException and its subclasses)
     *     → Compiler does not require them to be caught or declared
     *
     * - Runtime exceptions (e.g., NullPointerException, ArrayIndexOutOfBoundsException)
     *   are called unchecked exceptions — it's optional to handle them.
     *
     * - You can create custom exceptions by extending the Exception or RuntimeException class.
     */

    /**
     * Exception handling in Java can be done using:
     * - try-catch blocks
     * - finally blocks
     * - throw keyword
     * - throws keyword
     *
     * - The try-catch block is used to handle exceptions during runtime.
     * - The finally block is always executed, regardless of whether an exception is thrown or caught.
     * - The 'throw' keyword is used to explicitly throw an exception.
     * - The 'throws' keyword is used in method declarations to indicate what exceptions may be thrown.
     */
}

