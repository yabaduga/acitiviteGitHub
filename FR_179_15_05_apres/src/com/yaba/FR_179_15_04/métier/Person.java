package com.yaba.FR_179_15_04.métier;

public class Person {
    private int id;
    private String nom;
    private String prenom;
    private int age;

    public Person(int id, String nom) {
        this.id=id;
        this.nom=nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
