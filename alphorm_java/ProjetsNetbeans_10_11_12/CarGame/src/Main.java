import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de joueurs ?");
        Joueur.nbJoueur = sc.nextInt();
       // sc.nextLine();
        System.out.println("le nombre de joueurs est " + Joueur.nbJoueur);


        Joueur joueur = new Joueur();
        joueur.creaJoueur();

    }
}