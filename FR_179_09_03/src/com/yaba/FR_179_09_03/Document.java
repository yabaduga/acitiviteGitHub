package com.yaba.FR_179_09_03;

public class Document {
    private String titre;
    private String auteur;
    private int nbPages;

    public Document (String titre, String auteur, int nb) {
        this.titre=titre;
        this.auteur=auteur;
        nbPages = nb;
    }
    @Override
    public String toString(){
        return titre + " de " +auteur+" pages " + nbPages ;
    }
}
