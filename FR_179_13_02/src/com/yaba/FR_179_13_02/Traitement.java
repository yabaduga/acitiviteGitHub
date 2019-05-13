package com.yaba.FR_179_13_02;

public class Traitement {
    public synchronized void traite(Traitement autre) {

            System.out.println("En cours de traitement");
            autre.valide();
        }

        public synchronized void valide() {
            System.out.println("En cours de validation");
        }
    }
