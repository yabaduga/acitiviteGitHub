package com.yaba.FR_179_08_04;

public class Main {

    public static void main(String[] args) {

	Pile<Integer> maPile = new Pile();
	maPile.push(5);
	int valeur = maPile.pop();

	System.out.println("Pile : "+valeur);
    }
}
