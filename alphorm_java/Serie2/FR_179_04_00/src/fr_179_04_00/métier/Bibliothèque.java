package fr_179_04_00.métier;

public class Bibliothèque {

   private Document[] lesDocs;

    public Bibliothèque() {
        lesDocs = new Document[50];

    }

    public Document[] getLesDocs() {
        return lesDocs;
    }
}
