/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_10_00;

/**
 *
 * @author fabien
 */
public class FR_178_10_00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dé d = new Dé();

        d.faireRouler();

        int resultat = d.getValeurFace();
        System.out.println("valeur est : "+resultat);

        d.setValeurFace(4);
        d.getValeurFace();
        resultat = d.getValeurFace();
        System.out.println("valeur est : "+resultat);
    }

}
