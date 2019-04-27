package FR_179_03_3;

import FR_179_03_3.métier.*;

public class fr_179_03_3 {

    public static void main (String [] args) {

        Bibliotheque bib = new Bibliotheque();
        bib.ajoutedoc("montitrealacon","quicquaécritctedaube");
Document monDoc = new Document("bimba","kjdfkd");
monDoc.affiche();
System.out.println("bwa "+ monDoc.getAuteur()+", "+monDoc.getTitre());

    }
}