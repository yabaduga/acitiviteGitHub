package com.yabaduga.testclass;

public class Livre {
    String titre="";
    String auteur="";
    int annee=0;

    public Livre(String titre, String auteur, int annee){
       this.titre=titre;
       this.auteur=auteur;
       this.annee=annee;
    }
    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

}
