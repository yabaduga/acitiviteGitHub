/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_11_00;

import objetsmetiers.*;

/**
 *
 * @author fabien
 */
public class FR_178_11_00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Document[] lesDocs = new Document[5];

        lesDocs[0] = new Livre("La conscience même de soi", "Damasio");
        lesDocs[1] = new Revue("Java Magazine", 150);

        for (int i = 0; i < 2; i++) {
            System.out.println("docs : " + lesDocs[i].getInfos());
        }


    }
}