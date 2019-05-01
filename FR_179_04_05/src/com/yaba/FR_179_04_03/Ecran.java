package com.yaba.FR_179_04_03;

public class Ecran {
    public void affiche(String... params) {
        System.out.println("Affichage :");
        for (int i = 0; i < params.length; i++) {
            System.out.print(params[i]);
        }
    }
}
