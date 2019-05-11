package com.yaba.FR_179_09_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String leTexte="Ceci est une commande du client EBE5 pour infos";
        String leMotif ="(.*)(\\d+)(.*)";
        Pattern pt = Pattern.compile(leMotif);
        Matcher m = pt.matcher(leTexte);
        if(m.find()){
            System.out.println("Valeur : "+m.group(0));
            System.out.println("Valeur : "+m.group(1));
            System.out.println("Valeur : "+m.group(2));
            System.out.println("Valeur : "+m.group(3));

            // explication des groupes : https://cyberzoide.developpez.com/tutoriels/java/regex/
        }
    }
}
