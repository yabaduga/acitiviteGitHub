package com.yaba.FR_179_06_04;

public class Main {

    public static void main(String[] args) {

   FichierAbs fic = new FichierZip("Toto.txt")     ;

   fic.compresser(); // forcément la compression ZIP
    }
}
