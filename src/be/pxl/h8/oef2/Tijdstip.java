package be.pxl.h8.oef2;

public class Tijdstip {
	private int uren;
	private int minuten;
	private int seconden;

	public Tijdstip() {
		this(00,00,00);
	}
	
	public Tijdstip(int uren, int minuten, int seconden) {
		setUren(uren);
		setMinuten(minuten);
		setSeconden(seconden);
	}

	public Tijdstip(int seconden) {
		int a = 0, b = 0;
		while (seconden >= 3600) {
			seconden -= 3600;
			a += 1;
		}
		while (seconden >= 60) {
			minuten -= 60;
			b += 1;
		}
		setUren(a);
		setMinuten(b);
		setSeconden(seconden);
	}

	public Tijdstip(Tijdstip T) {
		setUren(T.getUren());
		setMinuten(T.getMinuten());
		setSeconden(T.getSeconden());
	}

	public int getSeconden() {
		return seconden;
	}

	public void setSeconden(int seconden) {
		while (seconden >= 60) {
			seconden -= 60;
			setMinuten(getMinuten() + 1);
		}
		this.seconden = seconden;
	}

	public int getMinuten() {
		return minuten;
	}

	public void setMinuten(int minuten) {
		while (minuten >= 60) {
			minuten -= 60;
			setUren(getUren() + 1);
		}
		this.minuten = minuten;
	}

	public int getUren() {
		return uren;
	}

	public void setUren(int uren) {
		while (uren >= 24) {
			uren -= 24;
		}
		this.uren = uren;
	}

	public void voegUrenToe(int uren) {
		setUren(getUren() + uren);
	}

	public void voegMinutenToe(int minuten) {
		setMinuten(getMinuten() + minuten);
	}

	public void voegSecondentoe(int seconden) {
		setSeconden(getSeconden() + seconden);
	}

	public void voegUrenToe() {
		voegUrenToe(1);
	}

	public String toStringTijd(boolean notatie) {
		String retvalue="";
		if (notatie == false) {
			if (getUren() == 24) {
				retvalue = 0 + ":" + getMinuten();
			} else {
				retvalue = getUren() + ":" + getMinuten();
			}
		} else {
			if (getUren() == 0) {
				retvalue = 12 + ":" + getMinuten() + " AM";
			} else {

				if (getUren() < 12) {
					retvalue = getUren() + ":" + getMinuten() + "AM";
				}
				if (getUren() > 12) {
					retvalue = (getUren() - 12) + ":" + getMinuten() + " PM";
				}
			}
		}

		return retvalue;
	}
	
	public String toStringTechnisch() {
		String retvalue="";
		
		if(getUren()<10) {
			retvalue+="0"+getUren()+":";
		} else {
			retvalue+=getUren()+":";
		}
		
		if(getMinuten()<10) {
			retvalue+="0"+getMinuten()+":";
		} else {
			retvalue+=getMinuten()+":";
		}
		
		if(getSeconden()<10) {
			retvalue+="0"+getSeconden();
		} else {
			retvalue+=getSeconden();
		}
		
		return retvalue;
	}
}