import java.util.*;

public class Joueur {
    public static String prenom = "";
    public static int score = 0;
    public static int nbJoueur;

    public String creaJoueur() {
        for (int i = 0; i < Joueur.nbJoueur; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Prénom joueur ?");
            Joueur.prenom = sc1.nextLine();
            System.out.println("le prénom du joueur " + (i+1) + " est " + Joueur.prenom);
        }
        return prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom() {
        this.prenom = prenom;
    }
}


