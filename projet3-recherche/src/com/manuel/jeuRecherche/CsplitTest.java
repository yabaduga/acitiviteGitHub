package com.manuel.jeuRecherche;
import java.io.*;
import java.util.Scanner;

public class CsplitTest {


            public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Quelle est la combinaison ? ");
                int Montab = sc.nextInt();
               // String Str = new String("WelcometoTutorialspoint.com");
                String Str = Integer.toString(Montab);
                System.out.println("Return Value :" );

                for (String retval: Str.split("")) {
                    System.out.println(retval);
                }
            }
        }
