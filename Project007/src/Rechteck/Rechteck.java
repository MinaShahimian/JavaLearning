package Rechteck;

import static Prog1Tools.IOTools.*;

public class Rechteck {
	// Attribute f�r die L�nge und die Breite definieren
	double laenge, breite;

	// static m�ssen wir jetzt weglassen
	double calcFlaeche() {
		double flaeche = laenge * breite;
		// das berechnete Ergebnis zur�ckliefern
		return flaeche;
	}

	double calcUmfang() {
		double umfang = 2 * laenge + 2 * breite;
		// das berechnete Ergebnis zur�ckliefern
		return umfang;
	}

	void ausgabe() {
		System.out.printf("SeiteA:%7.2fm    SeiteB:%7.2fm%n", laenge, breite);
		System.out.printf("Fl�che:%7.2fm�   Umfang:%7.2fm%n", calcFlaeche(), calcUmfang());
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
		laenge = readDouble("Bitte die L�nge der Seite A eingeben:");
		breite = readDouble("Bitte die L�nge der Seite B eingeben:");

	}
}
