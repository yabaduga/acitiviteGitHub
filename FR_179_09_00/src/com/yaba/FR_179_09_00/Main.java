package com.yaba.FR_179_09_00;

public class Main {

    public static void main(String[] args) {

        String str ="123";

        long debut = System.currentTimeMillis();
        for (int i=0;i<100000;i++)
        str+="abc"; // on peut concaténer sur une String
        long fin = System.currentTimeMillis();
        System.out.println("123 concaténé avec abc : "+(fin-debut));


        String replaceSttring=str.replace('a','w');
     //  System.out.println("a modifié en w "+replaceSttring); // si on affiche str = on aura toujours 123abc - String est immutable !!!


        StringBuilder strb = new StringBuilder("123");

        debut = System.currentTimeMillis();
        for(int i=0 ;i<100000;i++)

        strb.append("abc");// sur un StringBuilder, on ne peut que faire un append - il n'y a pas d'opérateur

        fin = System.currentTimeMillis();


        System.out.println("strb avec append : "+(fin-debut));
        String res=strb.toString();

        /*
        lors de la concaténation d'une String, on créé une nouvelle chaine
                alors que
        lors d'un append, on a réellement ajouté au buffer
        */

    }
}
