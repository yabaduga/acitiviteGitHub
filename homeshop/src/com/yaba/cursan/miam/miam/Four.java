package com.yaba.cursan.miam.miam;

public class Four {
    int puissance;
    int capacite;

    public void cuire(Aliment aliment){
        System.out.println("je cuis une aliment" + aliment.nom);
        System.out.println("avec ma capacité de :"+ capacite + " litre");
        System.out.println("et ma puissance de : "+ puissance + " degrés"+"\n");
        aliment.estCuit=true;

    }
}
