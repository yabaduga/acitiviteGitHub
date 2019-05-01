package com.yaba.FR_179_04_06;

public class Livre extends Document {
    private String auteur;

    public Livre(String titre, String auteur) {
        super(titre);
        this.auteur = auteur;
    }
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("auteur : " + auteur );
    }
}