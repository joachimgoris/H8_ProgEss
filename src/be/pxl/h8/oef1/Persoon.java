package be.pxl.h8.oef1;

import java.util.Calendar;

public class Persoon {
	private String voornaam;
	private String naam;
	private double lengte;
	private double gewicht;
	private int geboortejaar;

	//Constructors
	public Persoon() {
		this("onbekend","onbekend");
	}
	public Persoon(String naam, String voornaam) {
		setNaam(naam);
		setVoornaam(voornaam);
	}
	public Persoon(Persoon pers) {
		this(pers.getNaam(),pers.getVoornaam());
		setLengte(pers.getLengte());
		setGewicht(pers.getGewicht());
		setGeboortejaar(pers.getGeboortejaar());
	}
	
	
	public double getLengte() {
		return lengte;
	}

	public void setLengte(double lengte) {
		if (lengte > 2.40) {
			this.lengte = 2.4;
		} else {

			this.lengte = lengte;
		}
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public int getGeboortejaar() {
		return geboortejaar;
	}

	public void setGeboortejaar(int geboortejaar) {
		this.geboortejaar = geboortejaar;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String toString() {
		String retvalue = "Deze persoon is " + voornaam + " " + naam + "\ngewicht\t: " + gewicht + "\nlengte\t: "
				+ lengte + "\ngeboortejaar\t: " + geboortejaar;
		return retvalue;
	}

	public double berekenBmi() {
		double retvalue = (getGewicht() / (getLengte() * getLengte()));
		return retvalue;
	}

	public String geefOmschrijving() {
		String retvalue;

		if (berekenBmi() < 18) {
			retvalue = "ondergewicht";
		} else {
			if (berekenBmi() < 25) {
				retvalue = "normaal";
			} else {
				if (berekenBmi() < 30) {
					retvalue = "overgewicht";
				} else {
					if (berekenBmi() < 40) {
						retvalue = "obesitas";
					} else {
						retvalue = "morbide obesitas";
					}
				}
			}
		}
		return retvalue;
	}

	public void voegVoornamenToe(String... strings) {
		for (String s : strings) {
			voornaam += " " + s;
		}
	}

	public int getLeeftijd() {
		int retvalue;
		retvalue = Calendar.getInstance().get(Calendar.YEAR) - getGeboortejaar();
		return retvalue;
	}
	
	public void groei() {
		setLengte(getLengte()+0.01);
	}
	
	public void groei(int cm) {
		setLengte(getLengte()+(cm/100));
	}
}
