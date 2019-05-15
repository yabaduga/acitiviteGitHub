package com.yaba.FR_179_14_01;

public class Main {

    public static void main(String[] args) {
        Ressource res = new Ressource();

        Thread [] lesThreads = new Thread[20];
        for (int i=0;i<20;i++){
            lesThreads[i]=new Thread(()-> {
                String str=res.lire();
            });
        }
        for (int i=0;i<20;i++) {
            lesThreads[i].start();
        }
    }
}
