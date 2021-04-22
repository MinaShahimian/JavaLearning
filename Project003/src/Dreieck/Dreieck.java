
package Dreieck;

import Prog1Tools.IOTools;

public class Dreieck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;
		double b = 3;
		double c ;
		double umfang = 12;
		double fleache = 6;

		// eingabe
		a = IOTools.readInt("Bitte die länge seit (a) eingeben:");
		b = IOTools.readDouble("Bitte die länge seit (b) eingeben:");

		// berechnung
		c = Math.sqrt(a * a + b * b);
		umfang = a + b + c;
		fleache = a * b / 2;

		System.out.println("seite c:" + c);
		System.out.printf("umfang: %10.2f %n", umfang);
		System.out.println("umfang: " + umfang);
		System.out.printf("fleache: %10.2f %n", fleache);
		System.out.println("fleache:" + fleache);

	}

}
