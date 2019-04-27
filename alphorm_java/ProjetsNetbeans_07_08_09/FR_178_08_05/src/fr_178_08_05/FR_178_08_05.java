/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_08_05;

import java.util.*;

/**
 *
 * @author fabien
 */
public class FR_178_08_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] tab = {5,6,7};

        System.out.println(tab[1]);
        tab[1] = 8;

        ArrayList tab1 = new ArrayList();
        tab1.add(5);
        tab1.add(6);
        tab1.add(7);

        System.out.println(tab1.get(1));
        tab1.set(1,9);
        System.out.println(tab1.get(1));

    }

}
