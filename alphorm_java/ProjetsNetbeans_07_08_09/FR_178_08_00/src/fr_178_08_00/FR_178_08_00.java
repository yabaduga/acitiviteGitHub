/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_08_00;

import java.util.ArrayList;


class Voiture {
    public void rouler() {
        
    }
}
/**
 *
 * @author fabien
 */
public class FR_178_08_00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int[] tab;
        
        tab = new int [5];
        
        for (int i=0; i<tab.length; i++) {
            tab[i] = i;
        }
        
        int[] tab2 = new int[] {4,5,6,7,8};
        
        Voiture[] tabStr = new Voiture[10];
        
        for (int i =0; i<tabStr.length; i++) {
            tabStr[i] = new Voiture();
        }
        for (int i =0; i<tabStr.length; i++) {
            tabStr[i].rouler();  
        }
        
    }
    
}
