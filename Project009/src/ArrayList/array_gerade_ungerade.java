package ArrayList;

import static Prog1Tools.IOTools.*;

import java.util.Random;

public class array_gerade_ungerade {

	public static void main(String[] args) {
		int[] zahlen = new int[20];
		int[] geradezahlen;
		int[] ungeradezahlen;
		int anzGerade = 0;
		int anzUngerade = 0;
		zufall_initialisieren2(zahlen);
		// zählen der geraden und ungeraden zahlen
		for (int zahl : zahlen) {
			if (zahl % 2 == 0)
				anzGerade++;
			else
				anzUngerade++;
		}
		System.out.println("Gerade Zahlen: " + anzGerade);
		System.out.println("Ungerade Zahlen: " + anzUngerade);
		// Arrays werden mit der Länge des Variableninhaltes angelegt
		geradezahlen = new int[anzGerade];
		ungeradezahlen = new int[anzUngerade];

		int indexGerade = 0;
		int indexUngerade = 0;
// zahlen ins richtige array kopieren
		for (int idx = 0; idx < zahlen.length; idx++) {
			if (zahlen[idx] % 2 == 0) {
				geradezahlen[indexGerade] = zahlen[idx];
				indexGerade++;
			} else {
				ungeradezahlen[indexUngerade] = zahlen[idx];
				indexUngerade++;
			}
		}

		ausgabe("Gerade", geradezahlen);
		ausgabe("Ungerade", ungeradezahlen);
	}

	public static void ausgabe(String ausgabetext, int[] z) {
		System.out.print(ausgabetext);
//		for (int i = 0; i < z.length; i++) {
		for (int zahl : z) {
//		System.out.printf("%4d  ",z[i]);
			System.out.printf("%4d  ", zahl);
		}
		System.out.println("");
	}

	public static void zufall_initialisieren(int[] z) {
		for (int i = 0; i < z.length; i++) {
			z[i] = (int) ((Math.random() * 500.0) + 1.0);
		}
	}

	public static void zufall_initialisieren2(int[] z) {
		Random random = new Random();
		for (int i = 0; i < z.length; i++)
			z[i] = random.nextInt(500) + 1;
	}

}
