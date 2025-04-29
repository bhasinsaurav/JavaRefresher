package com.refresher.multithreading;

public class mutithreading {
    /**
     * Multitasking
     *
     * - The ability of the operating system to run multiple tasks or processes simultaneously.
     * - Each task may be a separate program running independently.
     */

    /**
     * Multithreading
     *
     * - The ability to execute multiple threads within a single process.
     * - Helps achieve better resource utilization and responsiveness in applications.
     * - In Java, multithreading can be implemented by:
     *   1. Extending the Thread class.
     *   2. Implementing the Runnable interface.
     */

    /**
    * Synchronization
    *
    * - When multiple threads are accessing shared resources, we must control access to avoid inconsistency.
    * - Java provides the 'synchronized' keyword to ensure that only one thread can execute a block or method at a time.
    * - This prevents race conditions and ensures thread safety.
     */
    /**
     * Java Thread Lifecycle
     *
     *  [New]
     *    |
     *    |  start()
     *    v
     *  [Runnable]
     *    |
     *    |  run() — scheduled by CPU
     *    v
     *  [Running]
     *    |     \
     *    |      \
     *    |       \ sleep(), wait()
     *    |        \
     *    v         v
     *  [Dead]   [Waiting]
     *    ^         |
     *    |         | notify()
     *    |_________|
     *
     * Legend:
     * - New → Runnable: Thread is started using .start()
     * - Runnable → Running: Thread is picked by CPU and .run() executes
     * - Running → Waiting: Thread is paused using .sleep() or .wait()
     * - Waiting → Runnable: Thread is resumed using .notify()
     * - Running → Dead: Thread completes or is stopped using .stop()
     *
     * Notes:
     * - A thread cannot go from Dead to any other state.
     * - Calling .start() on a Dead thread will throw IllegalThreadStateException.
     */

    public static void main(String[] args) {
        numberCounter thread1 = new numberCounter();

        sumCalculator sumCalc = new sumCalculator();
        Thread thread2 = new Thread(sumCalc);                       // Created thread object and passed runnable because runnable is an interface and doesn't have any function to start execution of thread.

        thread1.start();                                            // Use to start thread1 running

        thread2.start();
        try {
            thread1.join();                                         // Used to join main thread with thread1 so it executes after thread 1 ends

            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
