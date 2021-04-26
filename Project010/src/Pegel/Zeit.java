package Pegel;

public class Zeit {

	// Attribute: Stunden und Minuten
	int _stunden;
	int _minuten;
	// = Variablen auf Klassen-Ebene
	// private = nur Code der Klasse darf zugreifen

	public Zeit(int std, int min) {
		_stunden = std; // in den eigenen Variablen merken
		_minuten = min;
	}

	public Zeit() {
		_stunden = 0;
		_minuten = 0;
	}

	// Methode zum Eintragen/Setzen einer Zeit
	// Input von Außen: std, min
	public void Setzen(int std, int min) {
		_stunden = std; // in den eigenen Variablen merken
		_minuten = min;
	}

	// public = jeder darf zugreifen
	// Konstruktor mit String
	public Zeit(String zeit) {
		Setzen(zeit);
	}

	public void Setzen(String zeit) {
		// in Array zerlegen
		String[] teile = zeit.split(":"); // { "12", "34" }
		// Prüfung
		if (teile.length < 2)

			throw new NumberFormatException("Keine gültige Zeit");
		// in int umwandeln
		Setzen(Integer.parseInt(teile[0]), Integer.parseInt(teile[1]));
	}

	public void Ausgabe() {
		System.out.printf("Zeit ist %2d:%2d\n", _stunden, _minuten);
	}

	// eine Anzahl Minuten zur aktuellen Zeit dazuzählen
	// ACHTUNG: Überlauf
	public void Addieren(int min) {
		// 15 + 90 = 105
		_minuten += min; // Minuten addieren
		// evtl. 105 Minuten 105 / 60 = 1
		_stunden += _minuten / 60;
		_minuten %= 60; // 105 / 60 = 1, 45 Rest
		// evtl. 25 Stunden
		_stunden %= 24;
	}

	public int GesamtMinuten() {
		return _stunden * 60 + _minuten;
	}

	public String toString() {
		return Integer.toString(_stunden) + ":" + Integer.toString(_minuten);

	}
}