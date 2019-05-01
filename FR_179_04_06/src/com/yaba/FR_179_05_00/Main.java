package com.yaba.FR_179_05_00;

import métier.Livre;

public class Main {

    public static void main(String[] args) {
        //Document doc = new Document("le titre de mon document");
        Livre monLivre = new Livre("le titre de mon livre");
        monLivre.affiche();

    }
}
