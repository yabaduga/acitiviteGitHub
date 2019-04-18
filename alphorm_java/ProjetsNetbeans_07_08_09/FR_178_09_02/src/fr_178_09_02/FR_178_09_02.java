/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_09_02;

import java.util.*;
/**
 *
 * @author fabien
 */
public class FR_178_09_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        ArrayList<String> tab = new ArrayList<>(Arrays.asList(args));
        
        for (int i=0; i<tab.size(); i++) {
            String str = tab.get(i);
            
            System.out.println("args "+str);
        }
        
        Iterator<String> it = tab.iterator();
        while(it.hasNext()) {
            String str = it.next();
            System.out.println("args "+str);
        }
                
        for(Iterator<String> it1 = tab.iterator(); it1.hasNext();) {
            String str = it1.next();
            System.out.println("args "+str);
        }
        
        for(String str : tab) {
             System.out.println("args "+str);
        }
    }
    
}
