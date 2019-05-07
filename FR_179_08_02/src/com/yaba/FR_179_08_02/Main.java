package com.yaba.FR_179_08_02;
import métier.*;
public class Main {

    public static void main(String[] args) {

        Bibliotheque bib = new Bibliotheque("Alphorm bib");
        bib.ajouteDocument("Science","le titre", 43);
        bib.ajouteDocument("Psycho","nouveau titre", "un auteur");


            System.out.println(bib.getInfos());

            for (String s : bib.getIndexes()){
                System.out.println("les clés sont : " +s);
            }

    }
}
