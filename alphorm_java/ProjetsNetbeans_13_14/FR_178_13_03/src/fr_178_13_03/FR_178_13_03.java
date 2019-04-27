/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_13_03;

/**
 *
 * @author fabien
 */
public class FR_178_13_03 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Bibliotheque bib;
        bib = new Bibliotheque();
        
        try {
            bib.ajouteLivre("La conscience même de soi");
            System.out.println("Tout est ok");

            bib.ajouteLivre("La conscience même de soi");
            System.out.println("Tout est ok");
            
          
        }
        catch(DoublonDeTitreException exp) {
            System.out.println("Un titre était en double");
            
          return;
        }
        catch(Exception e){
            System.out.println("Erreur inconnue");
            
           // throw new MonException(...);
        }
        finally {
            bib.affiche();
        }
        
    }
    
}
