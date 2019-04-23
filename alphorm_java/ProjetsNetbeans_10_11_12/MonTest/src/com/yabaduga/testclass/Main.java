package com.yabaduga.testclass;

import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("Saisissez le titre, puis l'auteur en enfin l'année, le tout séparé par un retour charriot");
        Scanner sc = new Scanner(System.in);
        String monTitre = sc.nextLine();
        String monAuteur = sc.nextLine();
        int monAnnee = sc.nextInt();

        Livre monLivre = new Livre(monTitre, monAuteur, monAnnee);
        try {
            FileWriter fw = new FileWriter("e:\\testlivre.txt");

            fw.write(monLivre.getTitre() + " écrit par " + monLivre.getAuteur() + " en " + monLivre.getAnnee()+ System.getProperty( "line.separator" ));
            fw.write(System.getProperty( "line.separator" ));
            fw.close();
            System.out.println(monLivre.getTitre() + " écrit par " + monLivre.getAuteur() + " en " + monLivre.getAnnee());

        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}