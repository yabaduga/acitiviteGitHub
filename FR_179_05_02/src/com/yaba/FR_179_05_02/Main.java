package com.yaba.FR_179_05_02;

public class Main {

    public static void main(String[] args) {


        Document doc1 = new Document();
        doc1.titre = "Mon titre";

        Document doc2 = new Document("mon titre directement dans l'initialisation de l'objet");

       Document doc3 = new Document("le titre", "l'auteur");


    }
}