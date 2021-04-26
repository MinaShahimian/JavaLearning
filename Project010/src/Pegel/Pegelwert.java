package Pegel;

public class Pegelwert {

	// Messdaten
	private double _pegelstand;
	private Zeit _messzeit;

	// Konstruktor mit fertigem Zeit-Objekt
	public Pegelwert(double stand, Zeit zeit)
    {
        _pegelstand = stand;
        _messzeit = zeit;   // Referenz kopieren/zuweisen
    }

	// Konstruktor mit Std/Min
	public Pegelwert(double stand, int std, int min)
    {
        _pegelstand = stand;
        _messzeit = new Zeit(std, min);
    }

	// Konstruktor mit "13:55"
	public Pegelwert(double stand, String zeit)
       
    {      _pegelstand = stand;
           _messzeit = new Zeit(zeit);      }

	// Ausgabe
	public void Ausgabe() {
		System.out.printf("Pegelstand: %.2f Zeit:%s%n", _pegelstand, _messzeit.toString());
		// System.out.printf("Pegelstand: %.2f
		// Zeit:%2d:%2d%n",_pegelstand,_messzeit._stunden,_messzeit._minuten) ;
		// Console.Write($"Pegelstand: {_pegelstand:0.00} ");
		// _messzeit.Ausgabe();
	}

	// Zugriff auf Einzelwerte
	public double GetPegelstand() {
		return _pegelstand;
	}

	// ACHTUNG: Zeit-Objekt kann auch geändert werden
	public Zeit GetMesszeit() {
		return _messzeit;
	}

}
