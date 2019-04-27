/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_09_01;

/**
 *
 * @author fabien
 */
public class FR_178_09_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int i=0;
        int j=0;
        
        for(i=0,j=2; i<args.length; i++, j=j+3) {
            System.out.println("args "+args[i]);
        }
        
        System.out.println(i);
        
        for(int k=0; k<args.length; k++);
        
        {
            
            
        }
        
       // for(;;);
        
      int entree=0;
      for(; true;) {
         // entree = System.in.read();
          if(entree == 'q') {
              break;
          }
          else if (entree=='c') {
              continue;
          }
              
          //...
      }
      
      
    }
    
}
