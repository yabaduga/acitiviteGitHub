package com.yaba.FR_179_05_02;

public class Document {

    String titre;
    String auteur;
    java.util.Date date;




   Document(String str) {
        this(str, "inconnu");
}
        Document() {
           this("inconnu","inconnu");
        }

        Document(String titre, String auteur) {
            this.titre = titre;
            this.auteur = auteur;
            date = new java.util.Date();
        }


    }

