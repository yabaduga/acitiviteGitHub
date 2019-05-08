package com.yaba.FR_179_09_03;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Saisir le titre, puis l'auteur et enfin le nb de pages (le tout séparer par un retour chariot");
        Scanner sc= new Scanner(System.in);
        String titre = sc.nextLine();
        String auteur = sc.nextLine();
        int nb = sc.nextInt();

         Document doc = new Document (titre, auteur, nb);
         System.out.println(doc);

       String leTexte=" ceci est un peu pourri, mais, on s'en fout  ! c'est pour travailler les scanners";
       Scanner sc2 = new Scanner(leTexte);
       sc2.useDelimiter(","); // change le délimiteur par défaut (qui est l'espace)
       while(sc2.hasNext()) {
           System.out.println(sc2.next());
       }
    }
}
