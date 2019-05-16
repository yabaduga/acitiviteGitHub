package com.yaba.FR_179_14_04;

import com.sun.xml.internal.ws.resources.SoapMessages;

public class Main {

    public static void main(String[] args) {

        final int MAX = 500;
        double[][] matrice;

        matrice = remplir(MAX, MAX);
        double sommeTotale = 0;
        long depart = System.nanoTime();
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                sommeTotale +=matrice[i][j];
            }
        }


        long duree = System.nanoTime() - depart;
        System.out.println("la durée du calcul est de : " + sommeTotale + " en " + duree);


        SommeMatrice sm1=new SommeMatrice(matrice,0,MAX/2);
        SommeMatrice sm2 = new SommeMatrice(matrice, MAX/2,MAX-1);

        depart = System.nanoTime();
        sm1.fork();
        sm2.fork();

        sommeTotale=sm1.join()+sm2.join();
        duree = System.nanoTime() - depart;
        System.out.println("la durée du calcul est de : " + sommeTotale + " en " + duree);

    }

    static double[][] remplir(int lignes, int colonnes) {
        double[][] retval = new double[lignes][colonnes];

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                retval[i][j] = Math.random() * 100;
            }

        }
        return retval;
    }
}