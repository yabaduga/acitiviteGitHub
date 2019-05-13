package com.yaba.FR_179_11_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        Voiture v = new Voiture("clio ", "54363");
        System.out.println("Voiture initiale " + v);
        FileOutputStream fos = new FileOutputStream("voiture.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(v);
        oos.close();

        FileInputStream fis = new FileInputStream("voiture.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        Voiture titine = (Voiture)obj; // nécessité de cast la voiture en objet
        ois.close();

        System.out.println("Voiture finale "+titine);

    }
}