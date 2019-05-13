package com.yaba.FR_179_10_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ouvreFichier("toto.dat");

    }

    private static void ouvreFichier(String s) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("toto.txt");
            int valeur = fis.read();


        }
        catch (FileNotFoundException e1){
            e1.printStackTrace();
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
        finally { // même si un return est présent sur un catch, le finally sera traité avant le return qui lui va stopper l'exécution du reste des blocs de code
            try {
                if(fis !=null)fis.close();
            }catch(IOException e3){
                e3.printStackTrace();
            }
        }

    System.out.println("fin de la méthode");
}
}
