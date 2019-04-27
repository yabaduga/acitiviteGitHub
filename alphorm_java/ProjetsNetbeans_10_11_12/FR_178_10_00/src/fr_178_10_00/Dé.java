/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_10_00;

/**
 *
 * @author fabien
 */
public class Dé {
    
    private int valeurFace=6;
    
    void faireRouler() {

        valeurFace = (int) (Math.random()*6+1);
    }
    
    int getValeurFace(){

        return valeurFace;
    }
    
    void setValeurFace(int v) {

        valeurFace = v;
    }
}
