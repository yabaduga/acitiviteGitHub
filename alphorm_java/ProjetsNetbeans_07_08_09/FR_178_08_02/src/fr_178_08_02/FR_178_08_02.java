/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_08_02;

/**
 *
 * @author fabien
 */
public class FR_178_08_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] tab = {3,8,5,6,7,3,9,4};
        System.out.println("while");
        int indice_while = 0;
        while(indice_while < tab.length) {

            System.out.println(tab[indice_while]);
            indice_while++;
        }
        
        indice_while = 0;
        System.out.println("do");
        do {

            System.out.println(tab[indice_while]);
            indice_while++;
        }while(indice_while<tab.length);

        System.out.println("for");
        for(int i=0; i<tab.length; i++) {
            System.out.println(tab[i]);
        }
        System.out.println("for e");
        for( int v : tab) {
             System.out.println(v);
        }
        
        int[][] tab2D = {{4,5,6},{5,6,4},{5,2,4}};

        System.out.println("for ee 2D");
        for (int i=0; i<tab2D.length; i++) {
            for (int j=0; j<tab2D[i].length;j++) {
                System.out.println(tab2D[i][j]);
            }
        }
        
    }
    
}
