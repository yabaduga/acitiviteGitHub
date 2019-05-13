package com.yaba.FR_179_11_06;


import java.io.Serializable;

class CarteGrise implements Serializable{
    String num;

    CarteGrise(String n) {
        this.num = n;
    }
}

public class Voiture implements Serializable {
    private String nom;
    private CarteGrise carte;

    Voiture(String nom, String n) {
        this.nom = nom;
        this.carte = new CarteGrise(n);
    }

    @Override
    public String toString() {
        return "Voiture " + nom + "carte : " + carte.num;
    }
}
