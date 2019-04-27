package fr_178_14_00.fr_178_14_00_graphique;

import fr_178_14_00.services.ServicesBib;

import javax.swing.*;

public class FenetrePrincipale extends JFrame {
    public static void main (String [] args){
        System.out.println("Début de programme");
        FenetrePrincipale main = new FenetrePrincipale();

        main.setVisible(true);
    }
    public FenetrePrincipale(){

        fr_178_14_00.metiers.Bibliotheque bib;
        bib = ServicesBib.getBibliotheque();
    }
}
