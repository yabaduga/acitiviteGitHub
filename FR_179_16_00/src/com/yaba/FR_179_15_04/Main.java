package com.yaba.FR_179_15_04;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bonjour");
        // remplacé par
        Locale loc = new Locale("fr","FR");
        ResourceBundle msg=ResourceBundle.getBundle("meschaines",loc);
        System.out.println(msg.getString("bonjour"));
    }
}
