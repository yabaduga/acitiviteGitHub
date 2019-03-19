package Applicatie;

public class Rij {

    //Een rij bestaat weer uit 4 pinnetjes
    Pin[] rij = new Pin[4];
    
    //constructor van Rij met 4 parameters met pinnetjes.
    public Rij(Pin pin1, Pin pin2, Pin pin3, Pin pin4) {
    	rij[0] = pin1;
    	rij[1] = pin2;
    	rij[2] = pin3;
    	rij[3] = pin4;    	
    }
    
    
    //Dit is weer de constructor, maar dan met 4 andere parameters. Dit heet 'overloading'. 
    public Rij(String string1, String string2, String string3, String string4) {
    	rij[0] = new Pin(string1);
    	rij[1] = new Pin(string2);
    	rij[2] = new Pin(string3);
    	rij[3] = new Pin(string4); 
    }


	public void print() {
		System.out.println(rij[0].getKleur() + rij[1].getKleur() + rij[2].getKleur() + rij[3].getKleur());
	}
    
    //Er zijn nu dus 2 manieren om het object 'Rij' te maken
    //Optie 1: Rij rij = new Rij(new Pin(), new Pin(), new Pin(), new Pin());	<-- door 4 pinnetjes mee te geven
    //Optie 2: Rij rij = new Rij("text", "text", "text", "text");				<-- door 4 Strings als parameters mee te geven
}
