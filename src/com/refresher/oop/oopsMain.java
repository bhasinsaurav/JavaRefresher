package com.refresher.oop;

import com.sun.tools.javac.Main;

public class oopsMain {
    // key concepts in oops -->
    // 1. CLASS
    //  A CLASS IS A BLUEPRINT FOR CREATING OBJECTS . IT DEFINES THE STRUCTURE (FIELDS) AND BEHAVIOUR (METHODS) OF OBJECTS.
    // 2. OBJECT
    //  AN OBJECT IS AN INSTANCE OF A CLASS. IT REPRESENTS THE REAL WORLD ENTITY AND HAS ATTRIBUTES AND BEHAVIOURS.
    // FOLLOWING ARE 4 PILLARS OF OOPS
    // 3. ENCAPSULATION
    //  ENCAPSULATION IS THE PRACTICE OF BUNDLING DATA (FIELDS) AND METHODS (FUNCTIONS) THAT OPERARE ON THE DATA INTO A SINGLE UNIT(CLASS). IT ALSO INVOLVES RESTRICTING DIRECT ACCESS TO SOME COMPONENTS USING ACCESS MODIFIERS (E.G., PRIVATE, PUBLIC , PROTECTED)
    // 4. INHERITANCE
    // INHERITANCE ALLOWS A CLASS TO ACQUIRE PROPERTIES AND METHODS OF ANOTHER CLASS. IT SUPPORTS CODE REUSABILITY.
    // THERE ARE 3 TYPES OF INHERITANCE --> A. SINGLE B. MULTILEVEL C. HIERARCHICAL
    // JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE
    // 5. POLYMORPHISM
    // IT ALLOWS METHODS TO PERFORM DIFFERENT TASKS BASED ON THE OBJECT THAT CALLS THEM. IT IS CAN BE DONE VIA
    // COMPILE-TIME POLYMORPHISM (METHOD OVERLOADING)- METHOD NAME WILL BE SAME THE DIFFERENCE WILL BE THE NUMBER OR TYPE OF ARGUMENTS PASSED.
    // RUNTIME POLYMORPHISM (METHOD OVERRIDING)- DIFFERENT CLASSES THAT HAS HIERARCHICAL INHERITANCE , OVERRIDES THE SAME METHOD THAT MEAN THEY ALL HAS THE SAME METHODS BUT DIFFERENT OUTPUT , SO IT WILL DEPEND ON WHICH OBJECT IS CALLING AND IT GIVES OUTPUT ACCORDING TO THAT OBJECT
    // 6. ABSTRACTION
    // IT HIDES THE IMPLEMETATION AND FOCUS ON ONLY ESSENTIAL DETAILS. IT IS DONE VIA ABSTRACT CLASSES AND INTERFACES.
    // AS CLASS IS BLUEPRINT FOR OBJECTS , INTERFACE IS BLUEPRINT FOR CLASS.
    // BY INTERFACE WE CAN ACHIEVE ABSTRACTION AND MULTIPLE INHERITANCE
    // WE CAN DEFINE STATIC CONSTANTS , FINAL CONSTANTS, STATIC METHODS, ABSTRACT METHODS, DEFAULT METHODS IN INTERFACE
    // DEFAULT METHODS CAN BE OVERRIDEN BUT STATIC METHODS CAN'T BE OVERRIDEN
     //Abstraction and Runtime Polymorphism example
    public static void main(String[] args) {
        Animal animal1 = new dog();
        Animal animal2 = new cat();
        Animal animal3 = new human();
        animal2.sayHello();
        animal1.sayHello();
        animal3.sayHello();

        animal1.legs();
        animal2.legs();
        animal3.legs();
    }
}

    abstract class Animal{
        abstract void sayHello();
        abstract void bye();
        void legs(){
            System.out.println("4");
        }
    }

    class dog extends Animal{


        @Override
        void sayHello() {
            System.out.println("bhaw");
        }

        @Override
        void bye() {
            System.out.println("bhaw bhaw");
        }
    }

    class cat extends Animal{

        @Override
        void sayHello() {
            System.out.println("meow");
        }

        @Override
        void bye() {
            System.out.println("meow meow");
        }
    }

    class human extends Animal{

        @Override
        void sayHello() {
            System.out.println("Hello");
        }

        @Override
        void bye() {
            System.out.println("Bye");
        }

        void legs(){
            System.out.println("Human Legs: 2");
        }
    }
