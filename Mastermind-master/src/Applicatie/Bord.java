package Applicatie;

public class Bord {

    private Rij[] veld = new Rij[12];

    public Bord() {
        for (int i = 0; i < veld.length; i++) {
            veld[i] = new Rij("-", "-", "-", "-");
        }
        print();
    }

    public void setVeld(Rij rij,int index){
        veld[index]=rij;
    }

    public Rij[]getVeld(){
        return veld;
    }

    public void print(){
        //foreach loop. Lees het als volgt: voor elke 'Rij' die we nu 'rij' noemen die in de array genaamd 'veld', gaan de rij printen.
        // er zitten 12 instanties van Rij in de array Veld, dus hij print elke rij en begint bij positie 0
        for (Rij rij : veld){
            rij.print();
        }
    }

}
