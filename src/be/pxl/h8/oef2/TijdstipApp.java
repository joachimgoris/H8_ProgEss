package be.pxl.h8.oef2;

public class TijdstipApp {

	public static void main(String[] args) {
		Tijdstip T1 = new Tijdstip(5,45,13);
		System.out.println(T1.toStringTijd(false));
		System.out.println(T1.toStringTijd(true));
		System.out.println(T1.toStringTechnisch());
		
		Tijdstip T2 = new Tijdstip(15,39, 02);
		System.out.println(T2.toStringTijd(false));
		System.out.println(T2.toStringTijd(true));
		System.out.println(T2.toStringTechnisch());
	}

}
