package com.yaba.FR_179_11_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
 /*
System.out.println("saisir un caractère pour récupérer ");
          int v = System.in.read();


        System.out.println("va : " + v); // va retourner le code de la touche (a va donner 97)*/


        System.out.println("saisir un texte pour récupérer ");
        InputStreamReader ins = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ins);
        String str = br.readLine();
        System.out.println("Str : "+str);
    }

}
