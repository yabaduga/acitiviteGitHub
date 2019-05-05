package com.yaba.FR_179_07_01;

public class Liste {
    private int [] tab = new int[10];
    private int compteur=0;
    int get(int indice){
        return tab[indice];
    }
    void add (int value) {
        tab[compteur++]= value;
    }
}
