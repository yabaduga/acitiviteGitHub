/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_09_00;

/**
 *
 * @author fabien
 */
public class FR_178_09_00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i=0;
        boolean affiche = false;
        
        if(args.length> 0)
        {
            if(args[0].equals("affiche"))
                affiche = true;
        }
        
        do {
            
            System.out.println(args[i]);
            
            i = i+1;
            
        }while(i < args.length && affiche);
        
    }
    
}
