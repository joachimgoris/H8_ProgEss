package be.pxl.h8.oef5;

public class Auto {
	private String merk;
	private String model;
	private int bouwjaar;
	private String kleur;
	private int maxSnelheid;
	private int count=0;
	
	public static final int MAX = 180;
	
	//constructors
	public Auto() {
		this("VW","Polo",2017,"grijs",160);
	}
	
	public Auto(String merk, String model, int bouwjaar, String kleur, int maxSnelheid) {
		setMerk(merk);
		setModel(model);
		setBouwjaar(bouwjaar);
		setKleur(kleur);
		setMaxSnelheid(maxSnelheid);
		count++;
	}
	
	public Auto(Auto auto) {
		this(auto.getMerk(),auto.getModel(),auto.getBouwjaar(),auto.getKleur(),auto.getMaxSnelheid());
	}

	//getters
	public String getMerk() {
		return merk;
	}

	public int getBouwjaar() {
		return bouwjaar;
	}

	public String getModel() {
		return model;
	}
	
	public String getKleur() {
		return kleur;
	}

	public int getMaxSnelheid() {
		return maxSnelheid;
	}
	
	//setters
	public void setMerk(String merk) {
		this.merk = merk;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public void setBouwjaar(int bouwjaar) {
		this.bouwjaar = bouwjaar;
	}

	public void setKleur(String kleur) {
		this.kleur = kleur;
	}


	public void setMaxSnelheid(int maxSnelheid) {
		if(maxSnelheid>MAX) {
			this.maxSnelheid = MAX;
		} else {
			this.maxSnelheid = maxSnelheid;
		}
	}
	
	public String print() {
		String retvalue = getMerk()+" "+getModel()+" "+getBouwjaar()+" "+getKleur()+" "+getMaxSnelheid();
		return retvalue;
	}
	
	public int aantal() {
		return count;
	}
}
