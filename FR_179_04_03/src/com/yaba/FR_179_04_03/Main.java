package com.yaba.FR_179_04_03;

public class Main {

    public static void main(String[] args) {
	Felin [] minous = new Felin [2];
	minous[0]= new Chat();
	minous[1]= new Lion();

for (Felin f : minous) {
    System.out.println(f.parle());
}

    }
}
