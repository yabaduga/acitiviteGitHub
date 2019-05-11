package com.yaba.FR_179_10_00;

import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {

        int valeur = Integer.parseInt("42g"); // excepetion non géré, le type g n'existe pas - va donner à la compilation une exception de format de number
        FileInputStream fis = new FileInputStream("data.dat"); // le compilateur voit l'exception et va proposer de la gérer
    }
}
