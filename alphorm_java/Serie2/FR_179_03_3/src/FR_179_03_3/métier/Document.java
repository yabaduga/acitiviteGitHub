package FR_179_03_3.métier;

public class Document {

String titre="incoonuy";
String auteur ="inconny";



    public Document(String t, String a) {
        titre = t;
        auteur = a;
    }

    public Document() {
        return;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String t) {
        this.titre = t;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String a) {
        this.auteur = a;
    }
    public String affiche() {
    return getTitre() + getAuteur();
    }
}
