package Rechteck;

import static Prog1Tools.IOTools.*;

public class Rechteck {
	// Attribute für die Länge und die Breite definieren
	double laenge, breite;

	// static müssen wir jetzt weglassen
	double calcFlaeche() {
		double flaeche = laenge * breite;
		// das berechnete Ergebnis zurückliefern
		return flaeche;
	}

	double calcUmfang() {
		double umfang = 2 * laenge + 2 * breite;
		// das berechnete Ergebnis zurückliefern
		return umfang;
	}

	void ausgabe() {
		System.out.printf("SeiteA:%7.2fm    SeiteB:%7.2fm%n", laenge, breite);
		System.out.printf("Fläche:%7.2fm²   Umfang:%7.2fm%n", calcFlaeche(), calcUmfang());
	}

	void setzen(double x, double y) {
		laenge = x;
		breite = y;
	}

	Rechteck(double x, double y) {
		setzen(x, y);
	}

	Rechteck() {
	}

	void einlesen() {
		laenge = readDouble("Bitte die Länge der Seite A eingeben:");
		breite = readDouble("Bitte die Länge der Seite B eingeben:");

	}
}
