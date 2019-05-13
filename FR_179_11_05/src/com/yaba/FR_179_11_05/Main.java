package com.yaba.FR_179_11_05;

import java.io.*;

public class Main {

    public static void main(String[] args)throws Exception {

        //     FileOutputStream fos = new FileOutputStream("toto.dat");
    ByteArrayOutputStream fos = new ByteArrayOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeDouble(3.14);
        bos.close();
System.out.println("Bytes : " +fos.toByteArray());
       // System.out.println("bos " +bos);
    }
}
