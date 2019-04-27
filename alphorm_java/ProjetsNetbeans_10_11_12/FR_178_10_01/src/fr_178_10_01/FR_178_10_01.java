/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_10_01;

/**
 *
 * @author fabien
 */
public class FR_178_10_01 {

    /**
     * @param args the command line arguments
     */
    
   /* public static void swap(int a, int b){
        int tmp =  a;
        a = b;
        b = tmp;
    }*/
     public static void swap(Integer a, Integer b){
        int tmp =  a;
        a = b;
        b = tmp;
    }
    public static void faireLaFete(Personne p) {
        p.feterAnniversaire();
    }
    
     public static void faireLaFetePour30ans(Personne p) {
        p.feterAnniversaire(30);
    }
    
    public static void main(String[] args) {
       
        int i=1;
        int j=2;
        
        System.out.println("avant : "+i+" et "+j);
        
        swap(i,j);
        
        System.out.println("apres : "+i+" et "+j);
        
        Personne moi = new Personne();
        faireLaFete(moi);
    }
    
}
