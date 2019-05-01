package com.yaba.FR_179_04_03;

public class EcranAvecPrompt extends Ecran {
    public int affiche (int data, String prompt) {
    System.out.println(prompt + " "+data);
    return data;
    }
}
