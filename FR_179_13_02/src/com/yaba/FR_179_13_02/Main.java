package com.yaba.FR_179_13_02;

public class Main {

    public static void main(String[] args) throws Exception {
        Traitement tr1 = new Traitement();
        Traitement tr2 = new Traitement();


        Thread t1 = new Thread(new Runnable() {


            @Override
            public void run() {
                System.out.println("Début du thread 1");
                tr1.traite(tr2);
            }
        });
        Thread t2 = new Thread(new Runnable() {


            @Override
            public void run() {
                System.out.println("Début du thread 2");
                tr2.traite(tr1);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Main se termine ");
    }
}

