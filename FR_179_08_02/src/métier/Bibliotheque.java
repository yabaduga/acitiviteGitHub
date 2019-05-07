package métier;

import java.util.*;

public class Bibliotheque {

    private String nom;
    private List <Document> lesDocuments; // utilisation de list plutot que arrayList afin de ne pas avoir de souci si on change pour une Linked list
    // on souhaite manipuler les conteneurs par le type de plus haut niveau
    private Map<String, Document> lesIndex;


    public Bibliotheque(String nom) {
        this.nom = nom;
        lesDocuments = new LinkedList <>();
        lesIndex=new HashMap <>();
    }

    public void ajouteDocument(String index,String titre, int nbPages) {

        Revue r = new Revue(titre, nbPages);
        lesDocuments.add(r);
        lesIndex.put(index, r);
    }

    public void ajouteDocument(String index,String titre, String auteur) {
        Livre l = new Livre (titre, auteur);
        lesDocuments.add(l);
        lesIndex.put(index, l);
    }

    public String getInfos() {
        String retval = "Bibliotheque " + nom + "\n";

        for (Document doc : lesDocuments) {
            retval += doc.getInfos() + "\n";
        }
        return retval;
    }
    public Collection<String> getIndexes() {
        return lesIndex.keySet();
    }
}