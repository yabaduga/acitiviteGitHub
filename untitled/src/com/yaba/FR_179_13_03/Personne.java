package com.yaba.FR_179_13_03;

public class Personne {
    private String prenom;
    private String nom;

    Personne(String p, String nom) {
        this.prenom = p;
        this.nom = nom;
    }

    Personne nomme(String prenom, String nom) {
        return new Personne(prenom, nom);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
