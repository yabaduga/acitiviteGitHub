package com.yaba.FR_179_14_03;

import java.io.IOException;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws Exception{

        Semaphore sp = new Semaphore(1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Tentative d'acquisition par le thread : ...");
                try {
                    sp.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(" acquisition réussie  par le thread : ...");

                try {
                    int r = System.in.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                sp.release();
            }
        }).start();
        Thread.sleep(1000);
        System.out.println("Tentative d'acquisition par le main... ");
        sp.acquire();
        System.out.println("acquisition réussie par le main... ");
        sp.release();
    }
}
