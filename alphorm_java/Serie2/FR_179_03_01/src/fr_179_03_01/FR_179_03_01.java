package fr_179_03_01;

public class FR_179_03_01 {

    public static void main (String [] rgs) {
        System.out.println("le nombre de document est :" +Document.getCompteur());

        Document doc = new Document("Le titre", "l'auteur");

       // System.out.println("mon document écrit par " +doc.getAuteur() +" ayant pour titre " + doc.getTitre());


        System.out.println("le nombre de document est :" +Document.getCompteur());
        System.out.println(doc.affiche());

        Document doc1 = new Document("Le trou", "de balle");

        System.out.println("le nombre de document est :" +Document.getCompteur());

        System.out.println(doc1.affiche());
    }


}
