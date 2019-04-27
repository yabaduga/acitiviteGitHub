/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_10_02;

/**
 *
 * @author fabien
 */
public class Document {
    
    //... infos
    private String titre;
    private String auteur;

    public void setTitre(String titre) {
        this.titre=titre;
    }
    void setAuteur(String auteur){
        this.auteur=auteur;
    }

    boolean aLeMemeTitre (Document doc){
        return this.titre == doc.titre;
    }

    static private int compteur=0;
    
    public Document() {
        compteur ++;
    }
    
    static public int getCompteur() {
        return compteur;
    }
}
