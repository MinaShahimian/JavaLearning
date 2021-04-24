package ArrayList;

import static Prog1Tools.IOTools.*;

import java.util.Random;

public class array_einlesen_einfuegen {

	public static void main(String[] args) {
		int[] zahlen = new int[100];
		int anzahl = 0;
		int inputzahl = -1;

		while (inputzahl != 0 && anzahl < 100) {
			inputzahl = readInt("Geben Sie bitte eine Zahl ein!");
			if (inputzahl == 0)
				break;
			zahlen[anzahl] = inputzahl;
			anzahl++;
		}
		ausgabe("zahlen array: ", zahlen, anzahl);

//	    inputzahl=readInt("Geben Sie bitte eine Zahl ein!");
//	    zahlen[anzahl]=inputzahl;
//	    anzahl++;
//		ausgabe("zahlen array 2: ",zahlen,anzahl);

		anzahl = einlesen("Geben Sie bitte eine Zahl ein!", zahlen, anzahl);
		ausgabe("zahlen array 2: ", zahlen, anzahl);

		zufall_initialisieren(zahlen);
		ausgabe("zufall:",zahlen,anzahl);
	}

	public static int einlesen(String ausgabetext, int[] z, int anz) {
		if (anz < 100) {
			int zahl = readInt(ausgabetext);
			z[anz] = zahl;
			return anz + 1;
		} else
			return 100;
	}

	public static void ausgabe(String ausgabetext, int[] z, int anz) {
		System.out.print(ausgabetext);
		for (int idx = 0; idx < anz; idx++) {
			System.out.printf("%4d  ", z[idx]);
		}
		System.out.println("");
	}

//	public static void ausgabe(String ausgabetext,int[] z) {
//		System.out.print(ausgabetext);
//		for (int zahl : z) {
//		   System.out.printf("%4d  ",zahl);
//	    }
//		System.out.println("");
//	}	
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
