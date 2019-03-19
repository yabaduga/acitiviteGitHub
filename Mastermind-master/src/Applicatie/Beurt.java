package Applicatie;

import java.util.Random;

//we importeren het static bord, is best handig, want dan is het makkelijk toegankelijk hier
import static Applicatie.Applicatie.bord;

// met Beurt heb je 2 keuzes, of je maakt alles STATIC, dan hoef je nooit een Beurt te maken in Applicatie en kun je de klasse gewoon aan roepen
// of je maakt het niet STATIC, dan moet je een instantie ervan maken. Ik heb hier een static voorbeeld van gemaakt

public class Beurt {
    static int beurt = 0;
    static String antwoord;

    //hier wil je alle acties doen die tijdens 1 beurt plaats vinden
    public static void speelBeurt(){
        //in dit voorbeeld wordt elke beurt een nieuwe Rij toegevoegd aan het bord met 4 pinnetjes met de huidige beurt
        //setVeld vraagt om 2 argumenten. de eerste is een nieuwe Rij(). Het tweede argument is het index nummer in welke rij het moet worden ingevuld
        bord.setVeld(new Rij(""+beurt, ""+beurt, ""+beurt, ""+beurt), beurt);
        bord.print();
        beurt++;
    }

    //alle methodes moeten hier static zijn, aangezien we nooit een instantie hebben gemaakt van deze klasse
    //Denk aan een klasse als de blauwdruk tekening, dat nog niet werkelijk bestaat. Door iets statisch te maken zeg je
    //eigenlijk dat deze methodes en variabelen ECHT bestaan voor dit blauwdruk EN voor elke instantie. Dus je kan zonder
    //een object/instantie van deze blauwdruk te gebruiken, wel antwoord maken en gebruiken.
    public static void genereerAntwoord() {
        Random random = new Random();
        antwoord = new String();
        for (int i = 0; i < 4; i++) {
            antwoord += Integer.toString(random.nextInt(6) + 1);
        }
    }
}
