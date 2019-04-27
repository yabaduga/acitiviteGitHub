/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_07_02;

public class FR_178_07_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int valeur = Integer.parseInt(args[0]);
        
        if(valeur == 5) {
            System.out.println("valeur vaut 5");
            System.out.println("et ça va bien");
        }
        else if(valeur <6) {
             System.out.println("sinon");
        }
        else {
            System.out.println("rien à dire");
        }  
        
       /* if(date < 21septembre && date > 21juin) {
        
        }*/
    }       
    
}
