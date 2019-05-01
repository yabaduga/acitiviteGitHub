package fr_179_04_02;

public class Document {

    private String titre;
    public Document (String titre) {
        this.titre=titre;
    }
    public String affiche() {
        return "le doc : "+titre;
    }

    Document ajouteUnMot(String app) {

        Document doc=new Document(titre+app);
        return doc;
    }
}
