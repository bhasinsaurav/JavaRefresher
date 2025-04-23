package com.refresher.multithreading;

public class sumCalculator implements Runnable {
    @Override
    public void run() {
        int sum =0;
        for (int i=0; i<500000000; i++)
            sum += i;

        System.out.println("Sum of all numbers " + sum);
    }
}
