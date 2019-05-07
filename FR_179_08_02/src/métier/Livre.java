package métier;

public class Livre extends Document {
    private String auteur;
    public Livre(String titre, String auteur) {
        super(titre);
        this.auteur=auteur;
    }
    @Override
    String getInfos() {
        return super.getInfos()+" de "+auteur;
    }
}
