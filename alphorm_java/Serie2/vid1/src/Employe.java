public class Employe {
    private String nom;
    private float salaire;

    public Employe (String nom, float salaire) {
        this.nom = nom;
        this.salaire=salaire;
        return;
    }

    public void affiche () {
        System.out.println("Je suis " + nom+ " et je gagne " + salaire);
    }
}