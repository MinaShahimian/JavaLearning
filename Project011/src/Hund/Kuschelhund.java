package Hund;

public class Kuschelhund extends Hund {
	// zus�tzliches Attribut
	private int _plueschfaktor;

	public Kuschelhund(String name, int marke, String rasse, // f�r die Superklasse (Basis-)
			int p) {
		super(name, marke, rasse); // weiterleiten an Konstruktor der Superklasse
		_plueschfaktor = p; // merkt sich eigenen
	}

	public int GetPlueschfaktor() {
		return _plueschfaktor;
	}

	// neue Methode zur Steuerberechnung
	public int BerechneSteuer() {
		return GetBasisSteuer() / 2;
	}
}
