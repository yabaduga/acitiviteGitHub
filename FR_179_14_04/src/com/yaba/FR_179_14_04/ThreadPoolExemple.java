package com.yaba.FR_179_14_04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExemple {
    public static void main (String[] args){

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i=0;i<10;i++) {
            Runnable ru = new MonThread(""+i);
                    executor.execute(ru);

        }
        executor.shutdown();
        while (executor.isTerminated()) {

        }
        System.out.println("Tous finis...");
    }
}
