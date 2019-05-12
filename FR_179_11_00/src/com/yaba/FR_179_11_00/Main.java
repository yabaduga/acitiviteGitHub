package com.yaba.FR_179_11_00;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {


        try (FileInputStream fis = new FileInputStream("monFichier.dat")){

            //...

            fis.close();
        } catch (IOException ex) { // on intercepte en une fois toutes les exceptions de la classe
            ex.printStackTrace();
        }


    }
}
