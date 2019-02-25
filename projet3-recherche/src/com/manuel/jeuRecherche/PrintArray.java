package com.manuel.jeuRecherche;
import java.util.*;

class ArrayExample {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numNoms = getInt("Nombre d'entrées du tableau ?");
        String[] noms = new String[numNoms];
        for (int i = 0; i < noms.length; i++) {
            noms[i] = getString("Entrée n°" + (i+1));
        }
        for (int i = 0; i < noms.length; ++i) {
            System.out.println(noms[i]);
        }
    }

    public static int getInt(String prompt) {
        System.out.print(prompt + " ");
        int entier = input.nextInt();
        input.nextLine(); // Get rid of this line
        // so that getString won't read it
        return entier;
    }

    public static String getString(String prompt) {
        System.out.print(prompt + " ");
        return input.nextLine();
    }
}