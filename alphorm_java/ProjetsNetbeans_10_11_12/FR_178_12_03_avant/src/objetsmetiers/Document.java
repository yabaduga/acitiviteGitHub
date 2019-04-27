package objetsmetiers;

public  abstract class Document {
    private String titre ="Inconnu";

    public Document (String titre) {
        this.titre=titre;
    }
    public String getInfos() {
    return titre;
    }
}
