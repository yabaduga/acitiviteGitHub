public class test_cmb {
    /**@test*/
    public static void test_cmb()
    {
        int[] mystere =new int[CMAX];
    genererCmb(mystere,4,6);
    afficherCmb0(mystere,4);
    int[] humain =new int[CMAX];
    saisirCmb0(humain,4,6);
    afficherCmb0(humain,4);}
}
