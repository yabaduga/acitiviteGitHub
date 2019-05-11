package com.yaba.FR_179_10_02;

public class LivreEnDoubleException extends Exception {

    private String titreDuLivre;
    public LivreEnDoubleException (String titreDuLivre) {
        super("titre du livre en double : " + titreDuLivre);
        this.titreDuLivre=titreDuLivre;
    }
    public String getTitreDuLivre() {
        return titreDuLivre;
    }
}
