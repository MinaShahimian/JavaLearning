package tag12_1;

public class Konto {

	private String  inhaber;
	private double kontostand=0.D;
	private double   uzRahmen=0.D;
	
	// der Construktor
	public Konto(){}
	
	public  Konto(String name, double uzRahmen,double ersteinzahlung){
		this.inhaber= name;
		this.uzRahmen = uzRahmen;
		this.kontostand=ersteinzahlung;
	}

	
	
	// konto anlegen und mit den Werten befüllen
	public void anlegen(String name, double uzRahmen){
		this.inhaber= name;
		this.uzRahmen = uzRahmen;
		this.kontostand=0.D;
	}

	// AusgabeString für die Kontoabfrage
	public String toString(){
		return String.format("Name:       %20s%n"
					       + "Kontostand:         %10.2f %n"
					       + "Überziehungsrahmen: %10.2f %n"
					+ "",inhaber,  kontostand,  uzRahmen); 
	} 
	
	// Funktion für die Einzahlung
	public void einzahlen(double ezBetrag){
		
		double ktoStandNeu = kontostand + ezBetrag;
		// Überprüfen ob die geplante Einzahlung nicht das gesetzte Limit überschreitet 
//		if (ezBetrag >= 15000){
//			// wenn der Wert 
//			throw new IllegalArgumentException("Der Eingabewert ist zu hoch");
//		}
			//...und wenn in Ordnung, Erhöhung durchführen 
			kontostand = ktoStandNeu;	
			System.out.printf("Der neue Kontostand beträgt: %.2f%n%n%n", kontostand);
//			
//		} else { // Ansonsten Information ausgeben
//			System.out.printf("Ihre Einzahlung übersteigt das Einlagelimit von € 15.000,- %n"
//					+ "daher beträgt Ihr aktueller Kontostand noch immer %.2f%n%n%n",kontostand);
//			throw new IllegalArgumentException("Ungültiger Wert für Stunde oder Minute!");
//		}
		
	}
	
	public void abheben(double ahBetrag){
		double ktoStandNeu = kontostand - ahBetrag;
		double maxBetrag = kontostand+uzRahmen;
	
		if (maxBetrag >= ahBetrag){
				kontostand = ktoStandNeu;
				System.out.printf("Der neue Kontostand beträgt: %.2f%n"
						+ "Sie haben noch %.2f zur Verfügung",kontostand, maxBetrag);
			} else {
				System.out.printf("Ihre Abhebung übersteigt den Max.Betrag von %.2f%n"
						+ "Bitte wählen Sie einen kleineren Betrag.%n%n", maxBetrag);
			}
		
		}
}




