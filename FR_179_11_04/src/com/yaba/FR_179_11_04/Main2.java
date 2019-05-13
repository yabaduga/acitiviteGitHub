package com.yaba.FR_179_11_04;
import java.io.*;
public class Main2 {
    public static void main(String[] args) throws Exception {
        try{
            FileInputStream fin=new FileInputStream("testout.txt");
            int i=fin.read();
            System.out.print((char)i);

            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
 //https://www.javatpoint.com/java-fileinputstream-class