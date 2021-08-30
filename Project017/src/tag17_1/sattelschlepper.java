package tag17_1;

public class sattelschlepper extends LKW {
	protected double _laderaum_m3;

	public sattelschlepper(String hersteller, int baujahr, double laderaum) {
		super(hersteller, baujahr);
		_laderaum_m3 = laderaum;
	}

	public sattelschlepper() {
	}

	public void drucken() {
		System.out.print(super.toString());
		System.out.printf("; Laderaum: %.2fm³%n", _laderaum_m3);
	}
}
