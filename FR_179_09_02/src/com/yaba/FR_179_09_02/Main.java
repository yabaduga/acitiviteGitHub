package com.yaba.FR_179_09_02;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        String leTexte="Le site est peut-être, temporairement indisponible, ou surchargé. Réessayez plus tard ;";

        StringTokenizer strTok = new StringTokenizer(leTexte,","); // sans délimiteur spécifié, par défaut le délimiteur est l'espace
        System.out.println("nb de mot : " + strTok.countTokens());
        while (strTok.hasMoreTokens()) {
            String mot = strTok.nextToken();
            System.out.println(mot);


        }
    }
}
