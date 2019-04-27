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
public class FR_178_07_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dé leDé = null;
        if(args[0]=="de") {
            leDé = new Dé();
        }
        else if(args[0]=="depipe") {
            leDé = new DéPipé();
        }
        else {
            leDé = new Dé();   
        }
        
        
        int res = 0;
       /* if(leDé instanceof Dé) {
            leDé.lancer();
        }
        else if(leDé instanceof DéPipé) {
            leDé.lancer();
        }

        */
        res = leDé.lancer();
        
        System.out.println("resultat "+res);
    }
    
}
