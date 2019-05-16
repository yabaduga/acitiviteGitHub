package com.yaba.FR_179_14_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tranche1, tranche2, tranche3, impot, imposition,montantimposition,decote;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le net imposable - déduit des frais ou abattement et des charge déductibles (Revenu fiscal de référence)");
        impot = sc.nextInt();
        if (impot > 9964 && impot < 27520) {
            tranche1 = impot - 9964;
            System.out.println("tranche 1 : " + tranche1);
            imposition = (tranche1 * 0.14);
            if(imposition>1595) {
                System.out.println("l'impot est de :" + imposition);
            }else{
                decote = 1196-(imposition*0.75);
                montantimposition=imposition-decote;
                System.out.println("du fait de l'abattement de 1595€ pour une personne seule, vous avez une décote de : "+(int)decote +" et le montant de l'impot est de : "+((int)montantimposition) +" €");
            }


        } else {
            if (impot > 27519 && impot < 73780) {
                tranche1 = 27519 - 9964;
                tranche2 = impot - 27520;
                System.out.println("tranche 1 : " + tranche1 +" pour un impot de "+(int)(tranche1 * 0.14));
                System.out.println("tranche 2 : " + tranche2 +" pour un impot de "+(int)(tranche2 * 0.3));
                montantimposition = ((tranche1 * 0.14) + (tranche2 * 0.3));
                System.out.println("l'impot est de :" + (int)montantimposition);
            }
        }

    }
}
