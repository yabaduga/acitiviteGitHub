/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_13_00;
import java.io.*;
/**
 *
 * @author fabien
 */
public class FR_178_13_00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
        System.out.println("hello world");
        
        if(args.length >0)
            System.out.println("args : "+args[0]);
        
        FileInputStream fis = new FileInputStream("toutou.txt");
        
        
    }
    
}
