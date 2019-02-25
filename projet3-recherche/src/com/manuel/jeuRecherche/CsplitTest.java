package com.manuel.jeuRecherche;
import java.io.*;
import java.util.Scanner;

public class CsplitTest {


            public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Quelle est la combinaison ? ");
                int Montab = sc.nextInt();
                String Str = Integer.toString(Montab);
                String[] tempArray;
                String delimiter ="";
                tempArray = Str.split(delimiter);
                for (int i = 0; i < tempArray.length; i++) {
                    System.out.println(tempArray[i]);
                }

              
            }
        }
