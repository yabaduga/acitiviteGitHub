package com.yaba.FR_179_09_02;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String leTexte="Le site est peut-être, temporairement indisponible, ou surchargé. Réessayez plus tard ;";

        StringTokenizer strTok = new StringTokenizer(leTexte,","); // sans délimiteur spécifié, par défaut le délimiteur est l'espace
        System.out.println("nb de mot : " + strTok.countTokens());
        while (strTok.hasMoreTokens()) {
            String mot = strTok.nextToken();
            System.out.println(mot);


        }
        char[] lesCaracteres = leTexte.toLowerCase().toCharArray();
        // on récupère la chaine sous forme de caractères unitaires
        // on les passes en minuscules pour qu'il n'y ait pas de différence dnas le comptage entre les casses
        // on passe ces caractères dans un tableau lesCaracteres

        Map<Character,Integer>lettres=new HashMap <>();
        // la map permet de gérer la clé et le caractère
        // clé est le caractère et l'integer est le nb de fois ou il est rencontré
        for (char c: lesCaracteres) {
            Integer v = lettres.get(c);
            if(v==null) {
                v=1; // bowing auto -> si n' jamais été rencontré, on le positionne à 1 (puisque premier comptage
            }else{
                v++; // si déjà rencontré la valeur prend +1
            }
            lettres.put(c,v);
        }
        for (char c : lettres.keySet()){
            // pour chaque clé, on a le compte que l'on remonte
            System.out.println("Char " +c+" -> "+lettres.get(c));
        }
    }
}
