package com.yaba.FR_179_06_06;

public class Frequence {

    private String frequence;
    private Frequence (String freq) {
        frequence=freq;
    }

    public static final Frequence Mensuel = new Frequence("Mensuel");
     public static final Frequence Hebdo = new Frequence("Hebdomadaire");

     String getValue() {
         return frequence;
     }
}
