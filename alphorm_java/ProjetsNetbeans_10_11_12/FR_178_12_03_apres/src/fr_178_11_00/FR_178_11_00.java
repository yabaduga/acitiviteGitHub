/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_11_00;

import objetsmetiers.*;

import javax.print.Doc;

/**
 *
 * @author fabien
 */
public class FR_178_11_00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Bibliotheque bib = new Bibliotheque("Manu Biblio");

        bib.AjouterDocument("La conscience même de soi", "Damasio");
        bib.AjouterDocument("Java Magazine", 150);

        for (Object doc : bib){
            System.out.println("doc : "+((Document)doc).getInfos());
        }


    }
}