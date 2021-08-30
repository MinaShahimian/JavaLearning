package tag17_1;

public class muldenkipper extends LKW {
	protected double _tonnen_beladung;

	public muldenkipper(String hersteller, int baujahr, double beladung) {
		super(hersteller, baujahr);
		_tonnen_beladung = beladung;
	}

	public muldenkipper() {
	}

	public void drucken() {
		System.out.print(super.toString());
		System.out.printf("; Beladung: %.2ft%n", _tonnen_beladung);
	}

}
