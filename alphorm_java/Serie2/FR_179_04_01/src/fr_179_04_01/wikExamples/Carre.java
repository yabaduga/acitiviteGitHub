import java.io.*;
/*
Nom : Carre.java
Rôle : Construction d'un carré magique d'ordre impair.
Compilation : javac Carre.java
Exécution : java Carre.java <ordre>
	avec <ordre> : entier impair > 1
Résultat : dans un fichier texte nommé carre_ordre.txt
*/
public class Carre
{
    public static void main(String args[])
            throws Exception
    {
        int ordre, ligne, colonne;
        int maxValue = (int)Math.sqrt((double)Integer.MAX_VALUE);

        System.out.println("Début du programme.");

        // test du paramètre obligatoire : > 1 et impair
        if (args == null || args.length == 0)
        {
            System.out.println("Usage : java Carre <ordre>\n"+
                    "\tavec <ordre> : entier > 1 et impair.");
            System.exit(1) ;
        }
        ordre = Integer.parseInt(args[0]);
        if (ordre <= 1 || (ordre%2) == 0 || ordre > maxValue )
        {
            System.out.println(ordre + " n'est pas impair ou n'est pas supérieur a 1" +
                    " ou est trop grand : > " + maxValue) ;
            System.exit(1) ;
        }
        System.out.println("Le paramètre " + ordre + " est correct : > 1 et impair");

        // Création du tableau
        int carre[][] = new int[ordre][ordre] ;

        System.out.println("Début du calcul");
        // Rangement 1er nombre n au milieu de la première ligne
        // Puis rangement des autres nombres.
        ligne = 0 ;
        colonne = ordre/2 ;
        for (int n=1; n<=(ordre*ordre); n++)
        {
            // Écriture dans le tableau dans la case calculée
            carre[ligne][colonne] = n ;

            // Détermination de la position de la prochaine case à écrire
            if ((n%ordre) == 0)
            {
                // Si débordement à gauche du tableau
                // Écriture dans la case sous le dernier nombre
                ligne++ ;
            }
            else
            {
                // Écriture dans la case en haut à gauche
                ligne = ((ligne == 0) ? ordre-1 : ligne-1);
                colonne = ((colonne == 0) ? ordre-1 : colonne-1);
            }
        } // for (int n=1; n<=ordre*ordre; n++)
        int sommeMagique = ordre * ( ordre * ordre + 1) / 2;

        // Création du fichier résultat
        String nomFic = "carre_" + ordre + ".txt";
        System.out.println("Fin du calcul, écriture du fichier "+ nomFic + "...");
        PrintWriter hFic = new PrintWriter(new BufferedWriter(new FileWriter(nomFic)));

        // Impression du tableau
        hFic.println("Carre magique d'ordre " + ordre);
        for (ligne=0; ligne<ordre; ligne++)
        {
            for (colonne=0; colonne<ordre; colonne++)
            {
                hFic.print(carre[ligne][colonne] + " ");
            }
            hFic.println("") ;
        }
        hFic.println("La somme magique est " + sommeMagique);
        hFic.close();
        System.out.println("fin écriture, programme terminé.");
    } // public static void main(String args[])
} // public class Carre