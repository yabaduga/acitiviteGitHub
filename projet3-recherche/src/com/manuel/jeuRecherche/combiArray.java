package com.manuel.jeuRecherche;


import java.util.Scanner;

public class combiArray {
    public static void main(String[] args) {
        /**
         * on déclare une variable tableau MaCombiArray en tant que int pour une longueur de 4
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez le nombre de chiffres pour la combinaison : ");

        int NbMaxComb = sc.nextInt();
        int[] MaCombiArray = new int[NbMaxComb];
        //System.out.println(Arrays.toString(MaCombiArray));

        System.out.println("le nombre de chiffres de la combinaison est : " + NbMaxComb + " et votre combinaison est " + MaCombiArray);
/*  */

    }
}
