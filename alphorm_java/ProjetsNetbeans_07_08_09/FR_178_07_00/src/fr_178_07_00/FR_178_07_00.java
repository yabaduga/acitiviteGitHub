/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_07_00;

class Voiture {
    
    private String nom;
    
    public Voiture(String n) {
        nom=n;
    }
}
/**
 *
 * @author fabien
 */
public class FR_178_07_00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int a=3;
        int b=4;
        
        boolean res = a<b;
        System.out.println("a<b : "+res);
        String str1 = "coco";
        String str2 = "coco";
        
        res = str1==str2;
        System.out.println("str1 / str2 "+res);
        
        Voiture v1 = new Voiture("RCZ");
        Voiture v2 = new Voiture("RCZ");
        
        res = v1 == v2;
        System.out.println("v1 / v2 "+res);
        
        res = (str1 != str2) && (a==b);
        
    }
    
}
