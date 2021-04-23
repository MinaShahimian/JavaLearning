package Zeit;

import static Prog1Tools.IOTools.*;

public class Zeit {
	// Attribute: Stunden und Minuten
	/* private */ int _stunden;
	private int _minuten;
	// = Variablen auf Klassen-Ebene
	// private = nur Code der Klasse darf zugreifen

	// Methode zum Eintragen/Setzen einer Zeit
	// Input von Außen: std, min

	public void einlesen() {
		int zeit;
		String stdein = "Ankunftzeit Stunden (0-23) :";
		String minein = "Ankunftzeit Minuten (0-59) :";
		do {
			zeit = readInt(stdein);
		} while (zeit < 0 || zeit > 23);
		_stunden = zeit;
		do {
			zeit = readInt(minein);
		} while (zeit < 0 || zeit > 59);
		_minuten = zeit;

	}

	public Zeit(int std, int min) {
		Setzen(std, min);
	}

	public Zeit() {
		// TODO Auto-generated constructor stub
	}

	public void Setzen(int std, int min) {
		_stunden = std; // in den eigenen Variablen merken
		_minuten = min;
	}
	// public = jeder darf zugreifen

	public void Ausgabe() {
		System.out.printf("Zeit ist %2d:%2d%n", _stunden, _minuten);
	}

	public void Ausgabe(String s) {
		System.out.printf("%s%2d:%2d%n", s, _stunden, _minuten);
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

	public int gesamtminuten() {
		return _stunden * 60 + _minuten;
	}

	public void Setzen(int minuten) {
		_stunden = minuten / 60;
		_minuten = minuten % 60;
	}

	public void setzen_gesamtminuten(int minuten) {
		_stunden = minuten / 60;
		_minuten = minuten % 60;
	}

	public int get_minuten() {
		return _minuten;
	}

	public int get_stunden() {
		return _stunden;

	}

}
