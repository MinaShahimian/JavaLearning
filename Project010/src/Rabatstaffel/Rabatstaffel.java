package Rabatstaffel;

import Prog1Tools.IOTools;

public class Rabatstaffel {

	public static void main(String[] args) {
		double endpreis, nachlass;
		int preis, rabatt;
		preis = 2200;
//		preis=readInt("Bitte geben Sie den Betrag ein: \n");

		rabatt = calcRabatt1(preis);
		endpreis = preis * (100.0 - rabatt) / 100.0;
		nachlass = preis * (rabatt / 100.0); // nachlass = preis - endpreis;
		System.out.printf("\nRabatt:: %d %% %.2f EUR%n", rabatt, nachlass);
		System.out.printf("Endpreis: %.2f EUR%n", endpreis);

		rabatt = calcRabatt2(preis);
		endpreis = preis * (100.0 - rabatt) / 100.0;
		nachlass = preis * (rabatt / 100.0); // nachlass = preis - endpreis;
		System.out.printf("\nRabatt:: %d %% %.2f EUR%n", rabatt, nachlass);
		System.out.printf("Endpreis: %.2f EUR%n", endpreis);
		
		rabatt=calcRabatt3(preis);
		endpreis = preis * (100.0 - rabatt) / 100.0;
		nachlass = preis * (rabatt / 100.0); // nachlass = preis - endpreis;
		System.out.printf("\nRabatt:: %d %% %.2f EUR%n", rabatt, nachlass);
		System.out.printf("Endpreis: %.2f EUR%n", endpreis);
		
	}

	public static int calcRabatt1(int preis) {
		int rabatt = 0;
		if (preis >= 5000)
			rabatt = 20;
		else if (preis >= 3000)
			rabatt = 14;
		else if (preis >= 2000)
			rabatt = 8;
		else if (preis >= 1000)
			rabatt = 3;
		return rabatt;
	}

	public static int calcRabatt2(int preis) {
		int rabatt = 0;
		int i;
		int[][] staffel = { { 5000, 20 }, { 3000, 14 }, { 2000, 8 }, { 1000, 3 }, { 0, 0 } };
		for (i = 0; staffel[i][0] > preis && i < staffel.length; i++);
		rabatt = staffel[i][1];
		return rabatt;
	}

	public static int calcRabatt3(int preis) {
		int rabatt = 0;
		int i;
		int[] umsatz = { 5000, 3000, 2000, 1000, 0 };
		int[] prozent = { 20, 14, 8, 3, 0 };
		for (i = 0; umsatz[i] > preis && i < umsatz.length; i++)
			;
		rabatt = prozent[i];
		return rabatt;
	}

}
