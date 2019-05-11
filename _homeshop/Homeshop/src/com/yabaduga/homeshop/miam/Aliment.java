package com.yabaduga.homeshop.miam;

public class Aliment {
String nom;
boolean estCuit;

public void manger() {
	if (estCuit) {
		System.out.println("Cet aliment : "+nom+" est bien cuit");
	}else {
	System.out.println("Beerk, cet aliment : " +nom+" est cru");
	System.out.println();
	
	}
}

}
