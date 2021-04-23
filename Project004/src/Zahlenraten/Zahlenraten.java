package Zahlenraten;

import Prog1Tools.IOTools;

public class Zahlenraten {

	public static void main(String[] args) {
		// binäres suchen basis
		// 1..1000 zahl ausdenken
		// mz=(uz+oz)/2
		// 500
		// richtige zahl? (=)
		// nein kleiner (k) angezeigte zahl oder groeszer (g)
		// uz=1 oz=499 mz=250 uz=501 oz=1000 mz=750
		// 10 versuche

		int uz = 1, oz = 1000, mz = 500;
		char antwort, antwort2;
		do {
			mz = (uz + oz) / 2;
			System.out.printf("ist deine zahl: %d ?(j/n)", mz);
			antwort = IOTools.readChar();
			if (antwort != 'j' && antwort != 'J' && antwort != 'n' && antwort != 'N') {
				System.out.println("Ungültige Eingabe");
				continue;
			}
			if (antwort == 'n' || antwort == 'N') {
				antwort2 = IOTools.readChar("ist deine zahl größer oder kleiner()g/k\n");
				if (antwort2 != 'g' && antwort2 != 'G' && antwort2 != 'k' && antwort2 != 'K') {
					System.out.println("Ungültige Eingabe");
					continue;
				}
				if (antwort2 == 'g' || antwort2 == 'G') {
					uz = mz + 1;
				} else
					oz = mz - 1;
			} 
			if (antwort == 'j' || antwort == 'J')
				System.out.println("Gratulieren");
		} while (antwort != 'j' || antwort != 'J');

		System.out.printf("%ngeratene Zahl: %d%n", mz);
		mz = doppeln(mz);
		System.out.printf("%ngeratene Zahl: %d%n", mz);

	}

	public static int doppeln(int x) {
		return x * 2;
	}

}
