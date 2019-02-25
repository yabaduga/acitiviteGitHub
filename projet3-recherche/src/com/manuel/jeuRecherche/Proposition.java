package com.manuel.jeuRecherche;

import java.util.Scanner;

public class Proposition {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quelle est votre proposition ? ");
            int Mapropos = sc.nextInt();
            String Str = Integer.toString(Mapropos);
            String[] tempArrayPropos;
            String delimiter ="";
            tempArrayPropos = Str.split(delimiter);
            for (int i = 0; i < tempArrayPropos.length; i++) {
                System.out.println(tempArrayPropos[i]);
            }


        }
    }


