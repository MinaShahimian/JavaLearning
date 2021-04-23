package Rechteck;

import static Prog1Tools.IOTools.*;//neue static

public class Rechteck {

	public static void main(String[] args) {
		double a = 2;
		double b = 3;
		// double c;
		double umfang = 12;
		double fleache = 6;

		// eingabe
		a = readInt("Bitte die länge seit (a) eingeben:");
		b = readDouble("Bitte die länge seit (b) eingeben:");

		// berechnung
		// umfang = 2 * a + 2 * b;
		// fleache = a * b;
		umfang = umfang(a, b);
		fleache = fleache(a, b);
		ausgabe_rechteck(umfang, fleache);

		System.out.printf("umfang: %10.2f %n", umfang);
		System.out.println("umfang: " + umfang);
		System.out.printf("fleache: %10.2f %n", fleache);
		System.out.println("fleache:" + fleache);

	}

	public static double umfang(double x, double y) {
		return 2 * x + 2 * y;
	}

	public static double fleache(double x, double y) {
		return y * x;
	}

	public static void ausgabe_rechteck(double x, double y) {
		System.out.printf("umfang: %10.2f %n", x);
		System.out.printf("fleache: %10.2f %n", y);
	}

}
