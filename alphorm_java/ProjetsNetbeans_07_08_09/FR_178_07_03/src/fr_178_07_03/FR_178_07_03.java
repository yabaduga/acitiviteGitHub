/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_07_03;

class Voiture {
    
    private String type;
    
    public String getType() {
        return type;
    }
    
    public Voiture(String t) {
        type=t;
    }
}

public class FR_178_07_03 {

    public static void main(String[] args) {
        
        if(args[0].equals("-c")) {
            //...
            
        }
        else {
            //...
            
        }
        
        Voiture v = new Voiture("4x4");
        demarrer(v);
        
        Voiture v1 = new Voiture("berline");
        demarrer(v1);
    }
    
    public static void demarrer(Voiture laVoiture) {
        
        if(laVoiture.getType().equals("4x4")) {
            
            
        }
        else if (laVoiture.getType().equals("berline")){
            
            
        }
    }
}
