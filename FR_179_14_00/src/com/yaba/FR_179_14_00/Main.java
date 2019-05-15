package com.yaba.FR_179_14_00;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        Compteur cpt = new Compteur();
        Set <Integer> tab1 = new HashSet <>();
        Set <Integer> tab2 = new HashSet <>();
        Set <Integer> tab3 = new HashSet <>();
        Set <Integer> tab4 = new HashSet <>();

        Thread t1 = new Thread(() -> {

            for (int i = 0; i < 100; i++)
                tab1.add(cpt.retournUniqueIndex());
        });

        Thread t2 = new Thread(() -> {
           for (int i = 0; i < 100; i++)
           tab2.add(cpt.retournUniqueIndex());
           });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 100; i++)
                tab3.add(cpt.retournUniqueIndex());
        });

        Thread t4 = new  Thread(() -> {
            for (int i = 0; i < 100; i++)
                tab4.add(cpt.retournUniqueIndex());
        });



            t1.start();
            t2.start();
            t3.start();
            t4.start();

            t1.join();
            t2.join();
            t3.join();
            t4.join();

            for (int i = 0; i < 100; i++) {
                System.out.print(i + " : ");
                if (tab1.contains(i)) System.out.print(" 1");

                if (tab2.contains(i)) System.out.print(" 2");

                if (tab3.contains(i)) System.out.print(" 3");

                if (tab4.contains(i)) System.out.print(" 4");
                System.out.println(" ");


        }
    }
}

