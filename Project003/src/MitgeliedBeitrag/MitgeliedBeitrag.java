package MitgeliedBeitrag;

import Prog1Tools.IOTools;

public class MitgeliedBeitrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char verheiratet = 'J';
		char studieren = 'J';
		double beitrag = 0;

		// Eingabe
		verheiratet = IOTools.readChar("verheiratet(J/N) eingeben:");
		studieren = IOTools.readChar("studieren (J/N) eingeben:");

		// Berechnung Entscheidung
		/*
		 * if (verheiratet == 'n' && studieren == 'n') beitrag = 300;
		 * System.out.println("Beitrag: " + beitrag); if (verheiratet == 'j' &&
		 * studieren == 'n') beitrag = 220; System.out.println("Beitrag: " + beitrag);
		 * if (verheiratet == 'j' && studieren == 'j') beitrag = 100;
		 * System.out.println("Beitrag: " + beitrag); if (verheiratet == 'n' &&
		 * studieren == 'j') beitrag = 180; System.out.println("Beitrag: " + beitrag);
		 */
		// Variante 2

		if (verheiratet == 'j') {
			if (studieren == 'j') {
				beitrag = 100;
				System.out.println("Beitrag: " + beitrag);
			} else {
				beitrag = 220;
				System.out.println("Beitrag: " + beitrag);
				
			}
		} else {
			if (verheiratet == 'n') {
				if (studieren == 'j') {
					beitrag = 180;
					System.out.println("Beitrag: " + beitrag);
				} else {
					beitrag = 300;
					System.out.println("Beitrag: " + beitrag);

				}
			}
			beitrag=300;
			if(verheiratet=='j');
			beitrag-=100;
			if(studieren=='j');
			beitrag-=80;
			
		}
	}
}
