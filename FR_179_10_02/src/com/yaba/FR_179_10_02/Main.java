package com.yaba.FR_179_10_02;

public class Main {

    public static void main(String[] args) throws LivreEnDoubleException{

        Bibliotheque bib = new Bibliotheque();
        bib.ajoute(new Livre("le titre de mon livre"));
        bib.ajoute(new Livre("le titre de mon livre"));

    }

}
