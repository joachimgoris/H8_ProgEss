package be.pxl.h8.oef1;

public class PersoonApp {

	public static void main(String[] args) {
		Persoon pers1 = new Persoon();
		pers1.setVoornaam("Joachim");
		pers1.setNaam("Goris");
		pers1.setLengte(188.4);
		pers1.setGewicht(70.2);
		pers1.setGeboortejaar(1998);
		System.out.println(pers1.getNaam());
		
		System.out.println(pers1.toString());
		System.out.println(pers1.berekenBmi());
		System.out.println(pers1.geefOmschrijving());
		pers1.voegVoornamenToe("An","Els","Kim");
		System.out.println(pers1.getVoornaam());
		System.out.println(pers1.getLeeftijd());
	}

}
