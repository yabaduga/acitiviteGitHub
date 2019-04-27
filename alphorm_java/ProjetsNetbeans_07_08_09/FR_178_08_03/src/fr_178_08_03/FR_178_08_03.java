/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_08_03;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author fabien
 */
public class FR_178_08_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        java.util.ArrayList tab = new java.util.ArrayList();

        tab.add("coucou");
        tab.add(123);
        tab.add(new java.util.Date());

        java.util.ArrayList<Integer> tab1 = new java.util.ArrayList<Integer>();

        tab1.add(2);
        tab1.add(7);
        tab1.add(6);

        for (int indice = 0; indice < tab.size(); indice++) {
            System.out.println(tab.get(indice));
        }

        for (int x : tab1) {
            System.out.println(x);
        }

        java.util.ArrayList<Integer> tab2 = new java.util.ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        ArrayList<Integer> tab3 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

        ArrayList<Integer> tab4 = new ArrayList<>(Arrays.asList(2, 5, 6, 8));
        for (int x : tab3) {
            System.out.println(x);
            for (int y : tab4) {
                System.out.println(y);
            }

        }
    }
}