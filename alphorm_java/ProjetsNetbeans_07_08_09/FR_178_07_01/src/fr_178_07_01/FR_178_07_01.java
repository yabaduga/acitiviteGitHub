/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_07_01;

/**
 *
 * @author fabien
 */
public class FR_178_07_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String str1 = "Toto";
        String str2 = "toto";
        
        boolean res = str1==str2;
        System.out.println("test "+res);
        
        res = str1.equals(str2);
        System.out.println("test "+res);
        
        res = str1.equalsIgnoreCase(str2);
        System.out.println("test "+res);
    }
    
}
