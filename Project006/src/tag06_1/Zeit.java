package tag06_1;

public class Zeit {

	  // Attribute: Stunden und Minuten
	   /* private */ int _stunden;
	    private int _minuten;
	    // = Variablen auf Klassen-Ebene
	    // private = nur Code der Klasse darf zugreifen

	    // Methode zum Eintragen/Setzen einer Zeit
	    // Input von Außen: std, min
	    public void Setzen(int std, int min)
	    {
	        _stunden = std; // in den eigenen Variablen merken
	        _minuten = min;
	    }
	    // public = jeder darf zugreifen

	    public void Ausgabe(){
	        System.out.printf("Zeit ist %2d:%2d\n",_stunden,_minuten);
	    }
	    // eine Anzahl Minuten zur aktuellen Zeit dazuzählen
	    // ACHTUNG: Überlauf
	    public void Addieren(int min)
	    {
	        // 15 + 90 = 105
	        _minuten += min;    // Minuten addieren
	        // evtl. 105 Minuten  105 / 60 = 1
	        _stunden += _minuten / 60;
	        _minuten %= 60;     // 105 / 60 = 1, 45 Rest
	        // evtl. 25 Stunden
	        _stunden %= 24;
	    }
	    
	    public int gesamtminuten() {
	       return _stunden*60+_minuten;
	    }
//	    public  void Setzen(int minuten) {
//		        _stunden=minuten / 60;
//		        _minuten=minuten % 60;
//		    }
	    
	    public  void setzen_gesamtminuten(int minuten) {
	        _stunden=minuten / 60;
	        _minuten=minuten % 60;
	    }
	    
	    
	    
}
