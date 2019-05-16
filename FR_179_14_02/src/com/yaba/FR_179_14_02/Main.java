package com.yaba.FR_179_14_02;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {

        BlockingQueue q = new ArrayBlockingQueue(10);
        Producteur p = new Producteur(q);
        Consommateur c1 = new Consommateur(q);
        Consommateur c2 = new Consommateur(q);

        new Thread (p).start();
        new Thread (c1).start();
        new Thread (c2).start();

    }
}
