package com.yaba.FR_179_06_01;

public class Main {

    public static void main(String[] args) {

        System.out.println(Voiture.getCompteur());
        Voiture v1=new Voiture();
        v1.setProprio("Manu");
        System.out.println(Voiture.getCompteur());

        Voiture v2= new Voiture();
        System.out.println(Voiture.getCompteur());

        int max = Voiture.MAXROUE;

    }

}
