/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_13_03;

import java.util.*;

/**
 *
 * @author fabien
 */
class Bibliotheque {

    private Map<String,Livre> lesLivres = new HashMap<String,Livre>();
    
    void ajouteLivre(String leTitre)throws DoublonDeTitreException {
        Livre lelivre =new Livre(leTitre);
        
        if(lesLivres.keySet().contains(leTitre)) {
            throw new DoublonDeTitreException(leTitre);
        }
        else{   
            lesLivres.put(leTitre, lelivre);
        }
    }

    void affiche() {
        for( String k : lesLivres.keySet()) {
            System.out.println("Livre : "+lesLivres.get(k));
        }
    }
    
}
