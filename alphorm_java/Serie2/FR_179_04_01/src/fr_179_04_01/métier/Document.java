package fr_179_04_01.métier;

 class Document {
     private String titre;
     private String auteur;
     Document(String t, String a) {
        titre=t;
        auteur=a;
    }
String affiche() {
         return titre + " de " + auteur;
}
 }
