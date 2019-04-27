/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_10_04;

/**
 *
 * @author fabien
 */
public class FR_178_10_04 {

    public static void affiche(int tab,String str) {
        
        for( int i = 0; i<tab; i++)
            System.out.print(".");
        
        System.out.println(str);
    }
    
    public static void affiche(String str) {
        System.out.println(str);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        affiche("Je m'appelle Fabien");
        
        affiche(4,"et j'habite ici");
        
        
    }
    
}
