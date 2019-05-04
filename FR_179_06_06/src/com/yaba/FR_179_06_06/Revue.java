package com.yaba.FR_179_06_06;

public class Revue {
    private String titre;
  //  private Frequence frequence;
private FreqEnum frequence;

    public Revue (String titre, FreqEnum frequence) {

        this.titre=titre;
        this.frequence=frequence;
    }

    public void affiche(){
        switch(frequence){
            case Mensuel:
                System.out.println("c'est tous les mois");
                break;
            case Hebdo:
                System.out.println("c'est chaque semaine");
                break;
            default :
                System.out.println("fréquence inconnu");
        }
    }
}
