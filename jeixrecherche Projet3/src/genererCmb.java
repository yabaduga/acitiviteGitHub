import java.util.Random;

public class genererCmb{
/**Taille maximale des Combinaison*/

final static int CMAX = 6;

/**Génère une Combinaison de n symboles dans [1..m]
 @param[out] c - une Combinaison@param[in] n - taille des Combinaison
 @param[in] m - nombre de couleurs*/

public static void genererCmb(int[] c,int n,int m)
        {
            Random rnd =new Random();
            for(int k = 0; k < n; ++k)
            {
                c[k] = rnd.nextInt(m) + 1;
            }
        }
        }