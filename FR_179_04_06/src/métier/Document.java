package métier;

public class Document {
    private String titre;

    public Document(String titre) {
        this.titre = titre;
    }

    protected String getTitre() {// protected est utilisé pour que la méthode soit accessible au voisinage - cela permet l'accès depuis les autres packages
        return titre;
    }
}
