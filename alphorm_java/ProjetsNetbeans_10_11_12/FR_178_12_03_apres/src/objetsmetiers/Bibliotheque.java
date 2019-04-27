package objetsmetiers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bibliotheque implements Iterable {

    private List lesDocs = new ArrayList();
    private int indice=0;

    private String nom;

    public Bibliotheque (String nom) {
        this.nom=nom;
    }
    public void AjouterDocument (String titre, String auteur) {
        lesDocs.add(new Livre(titre, auteur));

    }public void AjouterDocument (String titre, int nb) {
        lesDocs.add(new Revue(titre, nb));
    }


    @Override
    public Iterator iterator() {
        return lesDocs.iterator();
    }
}
