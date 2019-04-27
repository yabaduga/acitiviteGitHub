/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_13_01;

import java.io.*;

/**
 *
 * @author fabien
 */
public class FR_178_13_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
       
        if(args.length>0){
            int resultat = Integer.parseInt(args[0]);
            System.out.println("Le résultat vaut "+resultat);
        }
        else
            System.out.println("Pas d'argument à traiter");
        
       File monFichier = new File("hello.txt");
       if(monFichier.exists()) {
        
        FileInputStream fis = new FileInputStream("hello.txt");
        
       }
       else
       {
        throw new MonException();   
       }
        
        
    }
    
}
