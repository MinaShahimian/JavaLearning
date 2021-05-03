package tag12_1;

public class Array_main {

	public static void main(String[] args) {
		final int anzahl=10;
		int[] zahlen =new int[anzahl];

		zufall_initialisieren(zahlen);
		ausgabe(zahlen);
		initialisieren(zahlen);
		ausgabe(zahlen);
		
	}
public static void ausgabe(int[] z) {
	for (int i : z) {
	   System.out.printf("i=%1d    ",i);
    }
	System.out.println(" ");

}	
	// referenzdatentyp als parameter -> änderung am original
	public static void initialisieren(int[] z) {
		for (int i = 0; i < z.length; i++) {
//		z[i]=z.length-i;  runterzählen
		z[i]=i+1;     // hochzählen
		}
	}
	

	
	
	public static void zufall_initialisieren(int[] z) {
		for (int i = 0; i < z.length; i++) {
		   z[i]= (int) ((Math.random()*500.0)+1.0); 
		   //(int) cast, aus double mach int
		}
	}		



	}


