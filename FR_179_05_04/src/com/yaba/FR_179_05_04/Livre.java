package com.yaba.FR_179_05_04;

public class Livre extends Document {
    String auteur;

    @Override
    void affiche() {
        super.affiche(); // en ajoutant le super. =  > on appelle la méthode de la classe parente || sans cela on appellera uniquement la méthode affiche() de la classe Livre
        System.out.println("Auteur :"+ auteur);
    }
}
