/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_13_03;

/**
 *
 * @author fabien
 */
class DoublonDeTitreException extends Exception {

    private String leTitreAProbleme;
    
    public DoublonDeTitreException(String leTitre) {
        leTitreAProbleme = leTitre;
    }
    
}
