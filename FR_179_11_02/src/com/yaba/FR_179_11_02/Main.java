package com.yaba.FR_179_11_02;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws Exception{

        System.out.println("Bonjour Java ");
        System.err.println("Hello Jva ");

        System.setOut(new PrintStream(new FileOutputStream("toto.txt")));
    }
}
