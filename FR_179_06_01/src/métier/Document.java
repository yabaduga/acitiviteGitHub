package métier;

public class Document {

    private String titre;
    private static int compteur;

    public static int getCompteur() {
        return compteur;
    }

    public final static int MAXPAGES = 500;

    public Document(String titre) {
        this.titre = titre;
        compteur++;
    }

    public void affiche() {
        //..todo..
    }
}