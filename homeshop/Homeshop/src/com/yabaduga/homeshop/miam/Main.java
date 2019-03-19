package com.yabaduga.homeshop.miam;

public class Main {

	public static void main(String[] args) {
		
Four grandFour = new Four();
grandFour.capacite=55;
grandFour.puissance=260;

Aliment cake = new Aliment();
cake.nom="cake aux fruits";
cake.estCuit=false;
cake.manger();
System.out.println("");
grandFour.cuire(cake);
System.out.println("");
cake.manger();
	}

}
