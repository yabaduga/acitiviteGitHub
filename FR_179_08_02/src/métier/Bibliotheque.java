package métier;

import java.util.*;

public class Bibliotheque {

    private String nom;
    private ArrayList <Document> lesDocuments;


    public Bibliotheque(String nom) {
        this.nom = nom;
        lesDocuments = new ArrayList <>();
    }

    public void ajouteDocument(String titre, int nbPages) {
        lesDocuments.add(new Revue(titre, nbPages));
    }

    public void ajouteDocument(String titre, String auteur) {
        lesDocuments.add(new Livre(titre, auteur));
    }

    public String getInfos() {
        String retval = "Bibliotheque " + nom + "\n";

        for (Document doc : lesDocuments) {
            retval += doc.getInfos() + "\n";
        }
        return retval;
    }
}