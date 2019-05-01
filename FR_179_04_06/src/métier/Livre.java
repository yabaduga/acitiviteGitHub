package métier;

public class Livre extends Document {
    public Livre(String titre) {
        super(titre);
        // nécessaire pour récupérer le paramètre depuis le constructeur créé dans la classe "parente"
        // une fois qu"un constructeur a été créé, le constructeur par défaut n'existe plus
        // this.titre=titre; = ce code est interdit par le private de la class parente afin de ne pouvoir modifier le champ de donnée depuis une classe fille


    }

    public void affiche() {
        System.out.println("Livre : " + getTitre());
    }
}
