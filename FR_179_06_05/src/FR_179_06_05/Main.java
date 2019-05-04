package FR_179_06_05;

import javax.print.Doc;

public class Main {

    public static void main (String[] args) {

Bibliotheque bib = new Bibliotheque();
SensDeParcours it = bib.getParcours();

while (it.hasNext()) {

    Document doc =it.next();
    //...
}
    }
}
