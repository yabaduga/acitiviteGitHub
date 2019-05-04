package com.yaba.FR_179_05_05;

import javax.print.Doc;

public class Main {

    static void traite(Document d) {
        System.out.println(d.getAuteur());
    }
    public static void main(String[] args) {
	// à l'utilisation des frameworks (le java de base y compris) - il est inévitable d'utiliser le transtypage


     Livre doc = new Livre();
        traite(doc);
    }
}
