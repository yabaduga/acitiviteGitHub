package rechercheandmind;

import java.util.Scanner;

public class CompareSecProp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =1, b=3,c=2,d=5;
		int A,B,C,D;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Saisissez la combinaison A puis entrée, B puis entrée,... : ");
		    A = sc.nextInt(); 
		    B = sc.nextInt();
		    C = sc.nextInt();
		    D = sc.nextInt();
		    
		
		int CombSec[] = {a,b,c,d};
		int Proposition[]= {A,B,C,D};
		for (int i = 0; i < Proposition.length; i++) {
		    boolean present = false;
		    for (int j = 0; j < CombSec.length; j++) {
		        if (CombSec[i]==A) {
				present = true;
				break;
			}
		    }
		    if (present){
		        System.out.print("A oui ");
		    } else {
			System.out.print("A non ");
			
		    }
		}// permet un saut de ligne entre les A, B ...
		
		System.out.println("");
		for (int i = 0; i < Proposition.length; i++) {
		    boolean present = false;
		    for (int j = 0; j < CombSec.length; j++) {
		        if (CombSec[i]==B) {
				present = true;
				break;
			}
		    }
		    if (present){
		        System.out.print("B oui ");
		    } else {
			System.out.print("B non ");
			
		    }

	}System.out.println("");
		for (int i = 0; i < Proposition.length; i++) {
		    boolean present = false;
		    for (int j = 0; j < CombSec.length; j++) {
		        if (CombSec[i]==C) {
				present = true;
				break;
			}
		    }
		    if (present){
		        System.out.print("C oui ");
		    } else {
			System.out.print("C non ");
			
		    }

}System.out.println("");

	for (int i = 0; i < Proposition.length; i++) {
	    boolean present = false;
	    for (int j = 0; j < CombSec.length; j++) {
	        if (CombSec[i]==D) {
			present = true;
			break;
		}
	    }
	    if (present){
	        System.out.print("D oui ");
	    } else {
		System.out.print("D non ");
		
	    }
	    
}System.out.println("");
	}
	}

