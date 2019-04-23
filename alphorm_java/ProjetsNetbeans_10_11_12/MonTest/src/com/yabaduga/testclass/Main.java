package com.yabaduga.testclass;

public class Main {
    public static void main (String[] args){
    Livre monLivre=new Livre("Letitre","l'auteur",2015);
    System.out.println(monLivre.getTitre() +" "+ monLivre.getAuteur()+" "+monLivre.getAnnee());
}
}