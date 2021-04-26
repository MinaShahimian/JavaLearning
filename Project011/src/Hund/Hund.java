package Hund;

public class Hund {
	private String _name;
	private int _marke;
	private String _rasse;

	public Hund() {
	}

	public Hund(String name, int marke, String rasse) {
		_name = name;
		_marke = marke;
		_rasse = rasse;
	}

	// Zugriffsmethoden getter
	public String GetName() {
		return _name;
	}

	public int GetMarke() {
		return _marke;
	}

	public String GetRasse() {
		return _rasse;
	}

	public int GetBasisSteuer() {
		return 100;

	}
}
