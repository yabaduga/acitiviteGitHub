import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Fr_178_13_01 {

    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            int resultat = Integer.parseInt(args[0]);
            System.out.println(resultat);
        } else System.out.println("rien à traiter");

        File monFichier = new File("Hello.txt");
        if (monFichier.exists()) {
            FileInputStream fis = new FileInputStream("Hello.txt");
        } else {
            throw new MonException();
        }
    }
}
