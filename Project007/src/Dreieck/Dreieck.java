package Dreieck;

import static Prog1Tools.IOTools.*;

public class Dreieck {
	double SeiteA;
	double SeiteB;
	double SeiteC;
	double Umfang;
	double Flaeche;
	double Heron;

	public Dreieck(double a, double b) {
		SeiteA = a;
		SeiteB = b;
	}

	public Dreieck() {
		//
	}

	public void einlesen(String Text) {
		SeiteA = readDouble("Seite A = ");
		SeiteB = readDouble("Seite B = ");
	}

	private double SeiteC() {
		return Math.sqrt(SeiteA * SeiteA + SeiteB * SeiteB);
	}

	private double UmfangBerechnung() {
		return SeiteA + SeiteB + SeiteC();
	}

	private double Heron() {
		return UmfangBerechnung() / 2;
	}

	private double Flaeche() {
		return Math.sqrt(Heron() * (Heron() - SeiteA) * (Heron() - SeiteB) * (Heron() - SeiteC));
	}

	public void ausgabe() {
		System.out.printf("Seite C = %.2f cm, \nUmfang = %.2f cm, \nFläche = %.2f cm²", SeiteC(), UmfangBerechnung(),
				Flaeche());

	}
}
