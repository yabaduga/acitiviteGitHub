package com.yaba.FR_179_14_04;

public class MonThread implements Runnable {

    private String nom;
    public MonThread(String string) {
        nom=string;
    }

    @Override
    public void run() {
        System.out.println("début du thread "+nom);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin du thread "+nom);
    }
}
