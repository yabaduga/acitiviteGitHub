/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_07_05;

/**
 *
 * @author fabien
 */
public class FR_178_07_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        switch(args.length) {
            case 0:
                System.out.println("vous n'avez rien en longueur");
                break;
            case 1 :
                System.out.println("ton mot est long de 1 caractère");
                break;
            case 2 :
                System.out.println("ton mot est long de 2 caractères");
                break;
            default :
                System.out.println("prout");
                break;
        }
        
       /* String typedecase = "oie";
        switch(typedecase) {
         
            case "oie":
                //...
                break;
            case "pont" :
                //..
                break;
                
            default :
                //...
        }*/
    }

}
