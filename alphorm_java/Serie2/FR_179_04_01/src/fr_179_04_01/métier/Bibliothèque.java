package fr_179_04_01.métier;

public class Bibliothèque {
    private Document[] lesDocs = new Document[10];
    int indice = 0;

    public void ajouteDocument(String t, String a) {
        lesDocs[indice++] = new Document(t, a);
    }

    public String affiche() {
        String retval = "";
        for (Document d : lesDocs) {
            if (d != null) {
                retval += d.affiche() + "\n";

            }
        }
        return retval;
    }


}