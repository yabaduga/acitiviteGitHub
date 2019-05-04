package com.yaba.FR_179_05_06;

public class Bibliotheque {
    private  static Bibliotheque instance;

    public static Bibliotheque getInstance() {

        if (instance == null)
            synchronized(Bibliotheque.class){
            if(instance==null)
            instance = new Bibliotheque();
        }
            return instance;
        }

        private Bibliotheque() { // bloque la création de l'objet en dehors de la classe via l'instance unique (Singleton)

        }

    public static void Dispose() {
        instance =null;
    }

    public void ajouteDocument (String titre, String auteur) {
        //....
        }
    }

