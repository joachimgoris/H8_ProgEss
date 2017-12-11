package be.pxl.h8.oef6;

public class Datum {
	private int dag;
	private int maand;
	private int jaar;
	String[] maandNamen = new String[] {"januari","februari","maart","april","mei","juni","juli","augustus","september","oktober","november","december"};
	
	//Constructor
	public Datum() {
		this(1,1,2017);
	}
	public Datum(int d, int m, int j) {
		setDag(d);
		setMaand(m);
		setJaar(j);
	}
	public Datum(Datum d) {
		
	}
	
	
	public int getDag() {
		return dag;
	}
	public void setDag(int dag) {
		this.dag = dag;
	}
	public int getMaand() {
		return maand;
	}
	public void setMaand(int maand) {
		this.maand = maand;
	}
	public int getJaar() {
		return jaar;
	}
	public void setJaar(int jaar) {
		this.jaar = jaar;
	}
	
	public String toString() {
		String retvalue;
		
		return retvalue;
	}
}
