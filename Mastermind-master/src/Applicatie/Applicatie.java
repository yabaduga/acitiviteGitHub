package Applicatie;

import java.util.Random;
import java.util.Scanner;

public class Applicatie {
	static Bord bord =  new Bord();

	public static void main(String[] args) {
		Beurt.genereerAntwoord();
		while (Beurt.beurt < 12) {
			Beurt.speelBeurt();
		}
	}
}