package tag12_1;

public class Konto_main {

	public static void main(String[] args) {
//		T2K7 – Konto
//		Implementieren Sie die Klasse Konto mit den folgenden Instanzvariablen
//		? Name des Kontoinhabers (String)
//		? Guthaben (double) – kann auch negativ sein
//		? Überziehungsrahmen (double)
//		Implementieren Sie Methoden für einzahlen und abheben. Bei der Abhebung muss der
//		Überziehungsrahmen berücksichtigt werden. Implementieren Sie auch eine Methode um den
//		derzeitigen Kontostand auszugeben.
//	// ein paar Variablen deklarieren

		int eingabe;
		double uzRahmen = 600.0;
		String name = "rudi";

		// Objekt generieren
		Konto konto_main;
		konto_main = new Konto();
		konto_main.anlegen(name, uzRahmen);
		konto_main.einzahlen(700);
		System.out.println(konto_main.toString());
		konto_main.abheben(300);
		System.out.println(konto_main.toString());

	}

}
