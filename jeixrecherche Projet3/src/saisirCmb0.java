import java.util.Random;
import java.util.Scanner;

public class saisirComb0 {
    /**
     * Saisit la Combinaison du joueur@param[out] c - une Combinaison@param[in] n - taille de c@param[in] m - nombre de couleurs
     */
    public static void saisirCmb0(int[] c, int n, int m) {
        Scanner input = new Scanner(System.in);
        System.out.print(n + " chiffres dans [1.." + m + "]? ");
        for (int k = 0; k < n; ++k) {
            c[k] = input.nextInt();
        }
    }
}