public class afficherCmb0 {
    /**Affiche une Combinaison@param[in] c - une Combinaison@param[in] n - taille de c*/
    public static void afficherCmb0(final int[] c,int n)
    {
        for(int k = 0; k < n; ++k)
        {
            System.out.print(c[k] + " ");
        }
        System.out.println();
    }
}
