package ArrayList;

import static Prog1Tools.IOTools.*;

public class Array1_main {

	public static void main(String[] args) {
		// int z1, z2, z3, z4;// .. z100
		final int anzahl = 10;
		int summe = 0;
		double mw;
		int[] zahlen = new int[anzahl];
		// Dreieck[] darray=new Dreieck[10];
		zahlen[5] = 30;
		System.out.println(zahlen[5]);
		zahlen[4] = zahlen[5] * 2;
		System.out.println(zahlen[4]);
		// Initialisierung
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = i + 1;
		}
		System.out.println(zahlen[4]);
		System.out.println(zahlen[5]);
		ausgabe(zahlen);
		initialisieren(zahlen);
		ausgabe(zahlen);
		summe = summieren(zahlen);
		System.out.printf("Summe:%6d%n", summe);

		mw = calcMittelwert(zahlen);
		System.out.printf("Mittelwert:%7.2f%n", mw);

		zufall_initialisieren(zahlen);
		ausgabe(zahlen);
		summe = summieren(zahlen);
		System.out.printf("Summe:%6d%n", summe);

		mw = calcMittelwert(zahlen);
		System.out.printf("Mittelwert:%7.2f%n", mw);
		double min = calcMinimum(zahlen);
		System.out.printf("minimun: %3.2f %n", min);
		double max = calcMaximum(zahlen);
		System.out.printf("maximum: %2.2f %n", max);

	}

	public static void ausgabe(int[] z) {
		for (int i = 0; i < z.length; i++) {
			System.out.printf("idx:%4d -- zahl:%4d%n", i, z[i]);
//	System.out.printf("idx:%4d -- zahl:%4d%n",i,zahlen[i]);
		}
	}

	// referenzdatentyp als parameter -> änderung am original
	public static void initialisieren(int[] z) {
		for (int i = 0; i < z.length; i++) {
			z[i] = z.length - i;
		}
	}

	public static int summieren(int[] z) {
		int summe = 0;
		for (int i = 0; i < z.length; i++) {
			summe += z[i];
		}
		return summe;
	}

	public static void zufall_initialisieren(int[] z) {
		for (int i = 0; i < z.length; i++) {
			z[i] = (int) ((Math.random() * 500.0) + 1.0);
			// (int) cast, aus double mach int
		}
	}

	public static double calcMittelwert(int[] z) {
		// double summe = summieren(z);
		double mittelwert = summieren(z) / z.length; // double division
		return mittelwert;

	}

	public static double calcMinimum(int[] z) {
		double min = z[0];
		for (int j = 0; j < z.length; j++) {
			// if(min>z[j]) variant1
			// min=z[j];
			min = Math.min(min, z[j]); // variante2
			// min=min>z[j]?z[j]:min; variante 3
		}
		return min;
	}

	public static double calcMaximum(int[] z) {
		double max = z[0];
		for (int j = 0; j < z.length; j++) {
			max = Math.max(max, z[j]);
		}
		return max;
	}

}
