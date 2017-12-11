package be.pxl.h8.oef5;

public class AutoApp {

	public static void main(String[] args) {
		double b = 0;
		Auto a1 = new Auto();
		Auto a2 = new Auto("Renault","Clio",2004,"Zwart",140);
		Auto a3 = new Auto(a1);
		a3.setMaxSnelheid(200);
		Auto[] autos = new Auto[3];
		autos[0] = a1;
		autos[1] = a2;
		autos[2] = a3;
		
		for(Auto a : autos) {
			System.out.println(a.print());
			a.aantal();
			if(a.getMaxSnelheid()<Auto.MAX) {
				b++;
			}
		}
		
		System.out.println(b = b/a1.aantal());
	}

}
