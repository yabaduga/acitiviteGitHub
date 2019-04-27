/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_10_02;

/**
 * @author fabien
 */
public class FR_178_10_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("nb : " + Document.getCompteur());
        Document doc1 = new Document();
        System.out.println("nb : " + Document.getCompteur());
        Document doc2 = new Document();
        System.out.println("nb : " + Document.getCompteur());

        Document doc3 = new Document();
        doc3.setTitre("Titre1");
        doc3.setAuteur("Auteur1");
        Document doc4 = new Document();

        if (doc3.aLeMemeTitre(doc3)) {
            System.out.println("les deux docs ont le même titre ");
        }
    }

}
