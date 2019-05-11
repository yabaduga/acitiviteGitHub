package com.yaba.FR_179_10_07;


class Chat {
    int nbPattes;
    String nom;
    Chat (String nom) {
        this.nom=nom;
        //pattes = 4
    }
    void avance(){
        assert nbPattes==4 :"Le chat n'a pas le bon nombre de pattes : !!";
        // code : change la position du chat
    }
}
public class Main {

    public static void main(String[] args) {

Chat minou = new Chat("minou");
minou.avance();
    }
}
