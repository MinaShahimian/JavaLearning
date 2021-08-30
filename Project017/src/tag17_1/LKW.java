package tag17_1;

public class LKW {

	protected String _hersteller;
	protected int _baujahr;

	
	public String get_hersteller() {
		return _hersteller;
	}

	public void set_hersteller(String _hersteller) {
		this._hersteller = _hersteller;
	}

	public int get_baujahr() {
		return _baujahr;
	}

	public void set_baujahr(int _baujahr) {
		this._baujahr = _baujahr;
	}

	public LKW(String hersteller, int baujahr) {
		_hersteller = hersteller;
		_baujahr = baujahr;
	}

	public LKW() {
	}

	@Override
	public String toString() {
		return String.format("%n%s Hersteller; Baujahr: %d ", _hersteller, _baujahr);
	}

}
