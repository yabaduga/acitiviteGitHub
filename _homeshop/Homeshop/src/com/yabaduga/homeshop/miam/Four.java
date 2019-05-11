package com.yabaduga.homeshop.miam;

public class Four {
int puissance;
int capacite;

public void cuire(Aliment aliment)  {
	System.out.println("je cuis un aliment");
	System.out.println("avec ma capacité de "+ capacite +" litres");
	System.out.println("et ma puissance de " + puissance + " degres");
	aliment.estCuit=true;
}
}
