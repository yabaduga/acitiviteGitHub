package com.yaba.FR_179_07_00;

public class Fichier implements Noeud {
    private  String nom;

    public Fichier(String nom) {
        this.nom=nom;
    }
    @Override
    public String getNom(){
        return nom;
    }
}
