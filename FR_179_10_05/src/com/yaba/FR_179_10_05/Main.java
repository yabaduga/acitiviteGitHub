package com.yaba.FR_179_10_05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("toto.dat");
            int v=fis.read();

          //  int valeur = 12/v;

            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("le nom du fichier est il correct ?");
            e.printStackTrace();
        }catch (IOException e2){
            System.out.println("erreur de lecture ");
            e2.printStackTrace();
        }
        catch (Exception e3) {
            System.out.println("Erreurs différentes");
            //.... gestion des erreurs
            // si on mets Exception dns le premier catch, les autres blocs ctach ne seront pas traité, Excepetion étant plus générique
        }


    }
}
