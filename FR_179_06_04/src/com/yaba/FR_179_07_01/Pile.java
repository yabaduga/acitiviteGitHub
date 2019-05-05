package com.yaba.FR_179_07_01;

public class Pile implements Empilable{

private int valeur=0;


    //composisiton, association - la liste est à l' intéreieur de la pile
private Liste lesDonnees=new Liste();

@Override
    public void push(int v){
        valeur++;
        // ici on met en action la délégation
    //on utilise l'association/composisiotn préalablement mise en place pour attaquer via l'objet créé
       lesDonnees.add(v);

    }
@Override
    public int pop() {
        return lesDonnees.get(valeur--);
    }
}
