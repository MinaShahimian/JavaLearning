package Dreieckbestimmung;

public class Dreieckbestimmung_main {

	public static void main(String[] args) {

		Dreieckbestimmung d=new Dreieckbestimmung();
		d.setzen(4, 5, 6);
		d.drucken();
		d.dreieck_bestimmen();
		System.out.printf("Fl�che: %7.2fm�      umfang:%7.2fm%n"
				,d.calcFlaeche(),d.calcUmfang());
		
	}
	}


