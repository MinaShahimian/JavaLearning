package Stringdemo;
import static Prog1Tools.IOTools.*;
public class Stringdemo {

	public static void main(String[] args) {
		System.out.println("Welche Zeichenfolge?");
		String input = readString();
		System.out.println("Welches Zeichen?");
		char c = readChar();
		
		int anzahl = 0;
		// das Zeichen im String suchen
		// für jedes Zeichen
		for(int i = 0; i < input.length(); i++){
			// wenn das Zeichen im String gleich dem gesuchten Zeichen ist
			if(input.charAt(i) == c){
				anzahl++;
			}
		}
		
		System.out.printf("Das Zeichen %c kommt %d Mal vor %n", c, anzahl);
		
		// Variante 2: suchen, wobei Groß-Kleinschreibung nicht unterschieden wird
		// die Zeichenfolge in Kleinbuchstaben umwandeln
		String sKlein = input.toLowerCase();
		// und das Zeichen in einen Kleinbuchstaben umwandeln
		char cKlein = Character.toLowerCase(c);
		System.out.printf("Suche das Zeichen %c in %s %n", cKlein, sKlein);
		anzahl = 0;
		// gleiche Suche, aber mit sKlein und cKlein
		for (int i = 0; i < sKlein.length(); i++) {
			if(sKlein.charAt(i) == cKlein){
				anzahl ++;
			}
		}
		
		
		System.out.printf("Das Zeichen %c kommt %d Mal vor (groß/klein egal) %n", c, anzahl);
		
		// den Index des zeichens suchen
		int pos = sKlein.indexOf(cKlein);
		// wenn vorhanden
		if(pos >= 0){
			System.out.printf("Das erste Vorkommen ist an Index %d,"
					+ " restliche Zeichenfolge: %s %n", 
					pos, sKlein.substring(pos)); // restl. Zeichenfolge, inkl. gesuchtem Zeichen
		}else {
			System.out.printf("Das Zeichen kommt nicht vor");
		}
		


	}

}
