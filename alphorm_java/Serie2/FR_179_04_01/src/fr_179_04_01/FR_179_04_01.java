package fr_179_04_01;

import fr_179_04_01.métier.*;

public class FR_179_04_01 {
    public static void main(String [] args) {
        Bibliothèque bib = new Bibliothèque();
        bib.ajouteDocument("La conscience même de soi", "Damasio");
          bib.ajouteDocument("La trololoi", "Damasio");
               System.out.println(bib.affiche());
    }
}
