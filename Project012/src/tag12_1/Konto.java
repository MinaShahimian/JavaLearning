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

	
	
	// konto anlegen und mit den Werten bef�llen
	public void anlegen(String name, double uzRahmen){
		this.inhaber= name;
		this.uzRahmen = uzRahmen;
		this.kontostand=0.D;
	}

	// AusgabeString f�r die Kontoabfrage
	public String toString(){
		return String.format("Name:       %20s%n"
					       + "Kontostand:         %10.2f %n"
					       + "�berziehungsrahmen: %10.2f %n"
					+ "",inhaber,  kontostand,  uzRahmen); 
	} 
	
	// Funktion f�r die Einzahlung
	public void einzahlen(double ezBetrag){
		
		double ktoStandNeu = kontostand + ezBetrag;
		// �berpr�fen ob die geplante Einzahlung nicht das gesetzte Limit �berschreitet 
//		if (ezBetrag >= 15000){
//			// wenn der Wert 
//			throw new IllegalArgumentException("Der Eingabewert ist zu hoch");
//		}
			//...und wenn in Ordnung, Erh�hung durchf�hren 
			kontostand = ktoStandNeu;	
			System.out.printf("Der neue Kontostand betr�gt: %.2f%n%n%n", kontostand);
//			
//		} else { // Ansonsten Information ausgeben
//			System.out.printf("Ihre Einzahlung �bersteigt das Einlagelimit von � 15.000,- %n"
//					+ "daher betr�gt Ihr aktueller Kontostand noch immer %.2f%n%n%n",kontostand);
//			throw new IllegalArgumentException("Ung�ltiger Wert f�r Stunde oder Minute!");
//		}
		
	}
	
	public void abheben(double ahBetrag){
		double ktoStandNeu = kontostand - ahBetrag;
		double maxBetrag = kontostand+uzRahmen;
	
		if (maxBetrag >= ahBetrag){
				kontostand = ktoStandNeu;
				System.out.printf("Der neue Kontostand betr�gt: %.2f%n"
						+ "Sie haben noch %.2f zur Verf�gung",kontostand, maxBetrag);
			} else {
				System.out.printf("Ihre Abhebung �bersteigt den Max.Betrag von %.2f%n"
						+ "Bitte w�hlen Sie einen kleineren Betrag.%n%n", maxBetrag);
			}
		
		}
}




