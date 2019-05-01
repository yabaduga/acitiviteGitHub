package rechercheandmind;

import java.util.Scanner;

public class CompareSecProp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int es;
		for (es = 1; es < 11; es++) {
			int a = 1, b = 3, c = 2, d = 5;
			int A, B, C, D;
			int score=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Saisissez la combinaison A puis entrée, B puis entrée,... : ");
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			D = sc.nextInt();


			int CombSec[] = {a, b, c, d};
			int Proposition[] = {A, B, C, D};
			for (int i = 0; i < Proposition.length; i++) {
				boolean present = false;
				for (int j = 0; j < CombSec.length; j++) {
					if (CombSec[i] == A) {
						present = true;
						score =1;
						break;
					}
				}
				if (present) {
					System.out.print(" oui ");
				} else {
					System.out.print(" non ");

				}
			}// permet un saut de ligne entre les A, B ...

			System.out.println("");
			for (int i = 0; i < Proposition.length; i++) {
				boolean present = false;
				for (int j = 0; j < CombSec.length; j++) {
					if (CombSec[i] == B) {
						present = true;
						score = score+1;
						break;
					}
				}
				if (present) {
					System.out.print(" oui ");
				} else {
					System.out.print(" non ");

				}

			}
			System.out.println("");
			for (int i = 0; i < Proposition.length; i++) {
				boolean present = false;
				for (int j = 0; j < CombSec.length; j++) {
					if (CombSec[i] == C) {
						present = true;
						score=score+1;
						break;
					}
				}
				if (present) {
					System.out.print(" oui ");
				} else {
					System.out.print(" non ");

				}

			}
			System.out.println("");

			for (int i = 0; i < Proposition.length; i++) {
				boolean present = false;
				for (int j = 0; j < CombSec.length; j++) {
					if (CombSec[i] == D) {
						present = true;
						score=score+1;
						es=11;

							break;
					}
				}
				if (present) {
					System.out.println(" oui ");
					if (score ==4) {
						System.out.println("vous avez gagné");
						break;
					}
				} else {
					System.out.print(" non ");

				}

			}
			System.out.println("");
		}
	}
}

