package com.yaba.FR_179_11_05;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
       try (FileOutputStream fis = new FileOutputStream("data.dat")) {
            BufferedOutputStream bos = new BufferedOutputStream(fis) ;
            DataOutputStream dos =new DataOutputStream(bos);
            dos.writeDouble(3.1415);
            dos.close();
        } catch (IOException ex) {
// gestion de l'erreur
        }

        FileWriter fw = new FileWriter("monfichier.txt");
        fw.write("vla le boulet");
        fw.close();
    }
}
