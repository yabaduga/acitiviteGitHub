/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_10_01;

/**
 *
 * @author fabien
 */
public class Personne {
    int age = 45;
    
    void feterAnniversaire() {
        age++;
        //...
    }
    void feterAnniversaire(int a) {
        age=a;
        //...
    }
     void feterAnniversaire(String cmd,int a) {
        age=a;
        //...
    }
}
