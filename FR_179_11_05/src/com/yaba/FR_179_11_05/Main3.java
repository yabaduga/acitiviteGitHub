package com.yaba.FR_179_11_05;

import java.io.FileInputStream;

public class Main3 {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("testout2.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//https://www.javatpoint.com/java-fileinputstream-class