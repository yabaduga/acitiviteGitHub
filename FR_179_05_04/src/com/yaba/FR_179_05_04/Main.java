package com.yaba.FR_179_05_04;

public class Main {

static void affiche(Document d) {
    d.affiche();
}
    public static void main(String[] args) {
	Livre doc = new Livre();
	doc.titre="Mon titre";
	doc.auteur="Mon auteur";
	affiche(doc);
    }
}
