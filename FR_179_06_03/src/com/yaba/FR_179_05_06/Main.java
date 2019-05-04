package com.yaba.FR_179_05_06;

public class Main {

    public static void main(String[] args) {


        Bibliotheque.getInstance().ajouteDocument("le tirte", "l'auteur");
        Bibliotheque.getInstance().ajouteDocument("le tirte 2 ", "l'auteur2 " );

        Bibliotheque.Dispose();

    }
}
