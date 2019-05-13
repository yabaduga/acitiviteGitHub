package com.yaba.FR_179_13_01;

public class Tache implements Runnable{
    private Ressource ressource;
    private String nom;
    private int delta;

    public Tache(Ressource res, String nom, int delta) {
        this.nom = nom;
        this.ressource = res;
        this.delta = delta;
    }

   @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //.. modifier la ressource
            ressource.valeur += delta;

            System.out.println(nom+" v= "+ressource.valeur );
        }
    }
}