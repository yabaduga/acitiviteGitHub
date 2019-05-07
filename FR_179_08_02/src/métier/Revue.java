package métier;

public class Revue extends Document{
    private int nbPages;
    public Revue(String titre, int nbPages) {
        super(titre);
        this.nbPages=nbPages;

    }
    @Override
    String getInfos() {
        return super.getInfos()+ " : " + nbPages;
    }
}
