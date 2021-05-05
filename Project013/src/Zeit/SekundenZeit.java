package Zeit;

import static Prog1Tools.IOTools.*;

public class SekundenZeit extends Zeit {

	private int _sekunden;

	/**
	 * @param std
	 * @param min
	 */
	public SekundenZeit(int std) {
		super(std);
		_sekunden = 0;
	}

	public SekundenZeit(int std, int min) {
		super(std, min);
		_sekunden = 0;
	}

	public SekundenZeit(int std, int min, int sek) {
		super(std, min);
		_sekunden = sek;
	}

	public SekundenZeit() {
	}

	public void Setzen(int std, int min, int sek) {
		super.Setzen(std, min);
		_sekunden = sek;
	}

	public void Ausgabe() {
		System.out.printf("Zeit ist %02d:%02d:%02d%n", _stunden, _minuten, _sekunden);
	}

	public void Ausgabe(String s) {
		System.out.printf("%s%02d:%02d:%02d%n", s, _stunden, _minuten, _sekunden);
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", _stunden, _minuten, _sekunden);
	}

	public int gesamtsekunden() {
		return super.gesamtminuten() * 60 + _sekunden;
	}

	public void Setzen(int sekunden) {
		super.Setzen(sekunden / 60);
		_sekunden = sekunden % 60;
	}

	public void Addieren(int sekunden) {
		_sekunden += sekunden;
		_minuten += sekunden / 60; // Minuten addieren
		_sekunden %= 60;
		_stunden += _minuten / 60;
		_minuten %= 60;
		// evtl. 25 Stunden
		_stunden %= 24;
	}

}
