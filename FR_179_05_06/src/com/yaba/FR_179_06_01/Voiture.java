package com.yaba.FR_179_06_01;

public class Voiture {

    private String proprio;
    private static int compteur;
    private final int roues = 4; // peut etre initialiser à la déclaration ou dans le constructeur
    public final static int MAXROUE = 8;


    public static int getCompteur(){
        return compteur;
    }

    public Voiture() {
        proprio ="inconnu";
        compteur++;
    }
    public void setProprio(String p) {
        this.proprio=p;
    }

}
