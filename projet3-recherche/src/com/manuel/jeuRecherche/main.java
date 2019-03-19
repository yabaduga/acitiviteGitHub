package com.manuel.jeuRecherche;
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez le nombre de chiffres pour la combinaison : ");

        int NbMaxComb = sc.nextInt();
        String longueurcombinaison;
        System.out.println("Saisissez la combinaison : ");
        int vCombinaison = sc.nextInt();
        System.out.println("le nombre de chiffres de la combinaison est : " + NbMaxComb +" et votre combinaison est " + vCombinaison);


        // On convertit la variable vCombinaison en string pour l'affecter à une chaine longueurcombinaison afin
        // de récupérer la longueur de la combinaison saisie par le défenseur afin de tester qu'il respecte la
        // longueur qu'il a inséré en valeur

        longueurcombinaison= Integer.toString(vCombinaison);
        System.out.println("la longeur de la chaine est de  " + longueurcombinaison.length() + " dans la combinaison prosposée ");
        if (longueurcombinaison.length() != NbMaxComb)
        {
            System.out.println("la longueur de votre combinaison diffère de ce que vous avez déterminé :");
            System.out.println("Saisissez la combinaison de " + NbMaxComb +" chiffres" );
            int vCombinaison1 = 0;
            vCombinaison=vCombinaison1;
            vCombinaison1 = sc.nextInt();

            System.out.println("comb1 =" + vCombinaison1 + " et vComb =" + vCombinaison);
            sc.nextInt();
        }

    }

}