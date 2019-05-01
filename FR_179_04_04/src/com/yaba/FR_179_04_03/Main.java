package com.yaba.FR_179_04_03;

public class Main {

    public static void main(String[] args) {
	Ecran maConsole = new Ecran();
	maConsole.affiche(5);
	maConsole.affiche("coucou");
	maConsole.affiche(4.5);
	EcranAvecPrompt autre = new EcranAvecPrompt();
	autre.affiche(456, "prompt");
	autre.affiche(5);
    }
}
