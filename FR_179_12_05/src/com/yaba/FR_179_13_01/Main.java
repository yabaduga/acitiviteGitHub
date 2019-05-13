package com.yaba.FR_179_13_01;

public class Main {

    public static void main(String[] args) {
        Ressource res = new Ressource();
        res.valeur=0;
        Thread t1 = new Thread(new Tache(res, "Tache 1",1));
        Thread t2 = new Thread(new Tache(res, "Tache 2",-11));

        t1.start();
        t2.start();




    }
}
