/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_08_01;

/**
 *
 * @author fabien
 */
public class FR_178_08_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] tab = new int[6][7];
        
        tab[3][4] = 5;
        
        int capacite_en_i = tab.length;
        int capacite_en_j = tab[0].length;
        
        System.out.println(" en i : "+capacite_en_i+" en j : "+capacite_en_j);
     
        int [][] tab1 = {{4,5,6},{5,6,8}};
        capacite_en_i = tab1.length;
        capacite_en_j = tab1[0].length;
        
        System.out.println(" en i : "+capacite_en_i+" en j : "+capacite_en_j);
        
        for (int i =0; i<tab.length; i++) {
            for(int j = 0; j< tab[i].length; j++) {
                System.out.println("en i "+i+" , j "+j+" : "+tab[i][j]);
            }
        }
    }
    
}
