package Hund;

public class Wachhund extends Hund {
	// zusätzliches Attribut
	private String _einsatzort;

	public Wachhund(String name, int marke, String rasse, // für die Superklasse (Basis-)
			String ort) {
		super(name, marke, rasse); // weiterleiten an Konstruktor der Superklasse
		_einsatzort = ort; // merkt sich eigenen
	}

	public String GetEinsatzort() {
		return _einsatzort;
	}

	// neue Methode zur Steuerberechnung
	public int BerechneSteuer() {
		return GetBasisSteuer() / 2;
	}

}
