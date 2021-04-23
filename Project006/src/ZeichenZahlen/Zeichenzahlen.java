package ZeichenZahlen;

import static Prog1Tools.IOTools.*;

import Prog1Tools.IOTools;

public class Zeichenzahlen {

	public static void main(String[] args) {
		String zeile = "ABCDE abcde 123456 ,.:;!?() ";

		zeile = readLine("Gib mir bitte eine Zeile\n");
		while (zeile.length() != 0) {
			zeile_analysieren(zeile);
			zeile = readLine("Gib mir bitte eine Zeile\n");
		}
		System.out.println("Fertig");

	}

	public static void zeile_analysieren(String z) {
		char ch;
		int leerzaehl = 0;
		int groszzaehl =0;
		int kleinzaehl = 0;
		int sonstigenzaehl = 0;
		int ziffernzaehl = 0;
	
		for (int i = 0; i < z.length(); i++) {
			ch = z.charAt(i);
			if (ch == ' ' || ch == '\t')
				leerzaehl++;
			else if (ch >= 'A' && ch <= 'Z')
				groszzaehl++;
			else if (ch >= 'a' && ch <= 'z')
				kleinzaehl++;
			else if (ch >= '0' && ch <= '9')
				ziffernzaehl++;
		
			else
				sonstigenzaehl++;
		}

		System.out.printf("leerzähler:%3d%n", leerzaehl);
		System.out.printf("groszzähler:%3d%n", groszzaehl);
		System.out.printf("kleinzähler:%3d%n", kleinzaehl);
		System.out.printf("ziffernzähler:%3d%n", ziffernzaehl);
		System.out.printf("sonstigenzähler:%3d%n", sonstigenzaehl);
	}

}
