package Applicatie;

// Ik heb van 'Pins' ==> 'Pin' gemaakt, omdat het een enkel object is. Je kan ze wel in een array zetten, en dan spreek je over meervout
public class Pin {
	private String kleur;
	public Pin(String eenKleur) {
		kleur = eenKleur;
	}
	
	//getter voor kleur
	public String getKleur() {
		return kleur;
	}
}
