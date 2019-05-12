package com.yaba.FR_179_11_04;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{

        FileWriter fw=new FileWriter("toto.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.print("3.14");
        pw.close();


        FileOutputStream fos = new FileOutputStream("data.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeDouble(3.14);
        dos.close();


        FileOutputStream fos2 = new FileOutputStream("data2.dat");
        DataOutputStream dos2 = new DataOutputStream(fos2);
        dos2.writeBytes("vla la pelure le truc");
        dos2.close();
    }
}
