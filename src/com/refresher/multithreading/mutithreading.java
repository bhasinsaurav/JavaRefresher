package com.refresher.multithreading;

public class mutithreading {
    // Ability of operating system to run multiple tasks at the same time is known as multi-tasking
    // Ability to execute mutiple threads within a single process is known as multithreading
    //We can achieve multithreading in java either by extending thread class or implementing runnable
    // If there are multilple threads running and we want that only one thread access a program at a time , we use synchronized keyword in method definition
    public static void main(String[] args) {
        numberCounter thread1 = new numberCounter();

        sumCalculator sumCalc = new sumCalculator();
        Thread thread2 = new Thread(sumCalc);                       // Created thread object and passed runnable because runnable is an interface and doesn't have any function to start execution of thread.

        thread1.start();                                            // Use to start thread1 running

        thread2.start();
        try {
            thread1.join();                                         // Used to join main with thread1 so it executes after thread 1 ends

            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
