package fr_179_03_01;

public class Document {

    private String auteur;
    private String titre;

// on n'a pas obligation d'avoir des getters et setters selon comment on va positionner les constructions - cf /* dans le code
  /*  public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }*/

    public Document(String t, String a){
        titre =t;
        auteur =a;
        compteur++;
    }
    public String affiche (){
    return "Le document "+ titre+", "+auteur;
}


    private static int compteur=0;
    public static int getCompteur(){
        return compteur;
    }
}

