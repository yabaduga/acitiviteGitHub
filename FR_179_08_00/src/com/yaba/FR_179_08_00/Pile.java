package com.yaba.FR_179_08_00;

import org.jetbrains.annotations.Contract;

class Pile <Truc>{
     Truc [] datas;
     int indice;

    @Contract(pure = true)
    Pile (int taille){
        datas =  (Truc[])new Object[taille];
        indice=0;
    }
     void push(Truc doc) {
        datas[indice++]=doc;
    }

    Truc pop() {
        return datas[indice--];
    }
}
