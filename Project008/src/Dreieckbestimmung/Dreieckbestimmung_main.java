package Dreieckbestimmung;

public class Dreieckbestimmung_main {

	public static void main(String[] args) {

		Dreieckbestimmung d=new Dreieckbestimmung();
		d.setzen(4, 5, 6);
		d.drucken();
		d.dreieck_bestimmen();
		System.out.printf("Fläche: %7.2fm²      umfang:%7.2fm%n"
				,d.calcFlaeche(),d.calcUmfang());
		
	}
	}


