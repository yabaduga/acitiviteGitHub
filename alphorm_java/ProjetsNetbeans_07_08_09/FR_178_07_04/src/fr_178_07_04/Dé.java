/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_07_04;

/**
 *
 * @author fabien
 */
public class Dé {
    
    protected int valeurFace;
    public int lancer() {
        valeurFace = (int) (Math.random()*6+1);
        return valeurFace;
    }
}
