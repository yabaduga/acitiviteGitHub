package com.yaba.FR_179_08_02;
import métier.*;
public class Main {

    public static void main(String[] args) {

        Bibliotheque bib = new Bibliotheque("Alphorm bib");
        bib.ajouteDocument("le titre", 43);
        bib.ajouteDocument("nouveau titre", "un auteur");


            System.out.println(bib.getInfos());

    }
}
