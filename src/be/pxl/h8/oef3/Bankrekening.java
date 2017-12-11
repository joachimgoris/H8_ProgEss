package be.pxl.h8.oef3;

import java.util.Scanner;

public class Bankrekening {
	private String rekeningnummer;
	private String naam;
	private double saldo;
	private double rentepercentage;

	public Bankrekening() {
		this("geen", "onbekend", 0, 1.2);
	}

	public Bankrekening(String rekeningnummer, String naam, double saldo, double rentepercentage) {
		setRekeningnummer(rekeningnummer);
		setNaam(naam);
		setSaldo(saldo);
		setRentepercentage(rentepercentage);
	}

	public boolean geldig() {
		boolean retvalue = false;

		if (getRekeningnummer().equals("geen") == true) {
			System.out.println("Sorry geen rekeningnummer.");
			return false;
		} else {
			if (getNaam().equals("onbekend") == true) {
				Scanner input = new Scanner(System.in);
				setNaam(input.nextLine());
				input.close();
				return true;
			}
		}

		return retvalue;
	}

	public String getRekeningnummer() {
		return rekeningnummer;
	}

	public void setRekeningnummer(String rekeningnummer) {
		this.rekeningnummer = rekeningnummer;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo < 0) {
			this.saldo = 0;
		} else {
			this.saldo = saldo;
		}
	}

	public double getRentepercentage() {
		return rentepercentage;
	}

	public void setRentepercentage(double rentepercentage) {
		if (rentepercentage < 0) {
			this.rentepercentage = 0;
		} else {
			this.rentepercentage = rentepercentage;
		}
	}

	public void stort(double bedrag) {
		setSaldo(getSaldo() + bedrag);
		System.out.println("na storting van "+bedrag+" euro");
	}

	public void neemOp(double bedrag) {
		if (geldig() == true) {
			if (bedrag <= getSaldo()) {
				setSaldo(getSaldo() - bedrag);
				System.out.println("na opname van "+bedrag+" euro");
			} else {
				if (getSaldo() == 0) {
					System.out.println("U kan geen geld opnemen.");
				} else {
					System.out.println("U mag enkel " + getSaldo() + "opnemen.");
					setSaldo(getSaldo() - getSaldo());
					System.out.println("na opname van "+getSaldo()+" euro");
				}
			}
		}
	}

	public void verrichting(double... bedragen) {
		if (geldig() == true) {
			for (double b : bedragen) {
				if (b > 0) {
					stort(b);
				} else {
					if (b <= 0) {
						neemOp(b);
					}
				}
			}
		}
	}

	public void schrijfRenteBij() {
		if (geldig() == true) {
			setSaldo(getSaldo() * getRentepercentage());
			System.out.println("rente wordt bijgeschreven voor "+(getSaldo()*getRentepercentage())+" euro");
		}
	}
	
	public String print() {
		String retvalue="Saldo op spaarrekening "+getRekeningnummer()+" op naam van "+getNaam()+" bedraagt "+getSaldo()+" euro";
		return retvalue;
	}
	
	
}
