package com.yaba.FR_179_06_04;

public abstract class FichierAbs {
    String nom;

    public FichierAbs (String nom) {
        this.nom=nom;
    }


    protected abstract void ecrireEntete();
    protected abstract void ecrireData();

    //méthode template !!
    public void compresser(){
        //écrire l'entete
        ecrireEntete();
        //écrire les datas
        ecrireData();
    }
}
