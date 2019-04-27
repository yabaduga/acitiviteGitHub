/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_09_03;

/**
 *
 * @author fabien
 */
public class Personne {
    private String nom;
    
    public Personne(String s) {  
        String ret = "Nom : ";
        
        nom=ret+s;
    }
    
    public String getNom() {     
        return nom;
    }
}
