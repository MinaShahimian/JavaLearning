package fahrkarteschalter;
import Prog1Tools.IOTools;

public class fahrkarteschalter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fahrkartenzahl=10;
		double fahrkartenpreis=100;
		double rabatt=20;
		double einzelpreis=10;
		double gesamtpreis=30;
		
		
		
		fahrkartenzahl=IOTools.readInt("Bitte Anzahl der Fahrkarten(1-200) eingaben:");
		fahrkartenpreis=IOTools.readDouble("Bitte fahrkartenpreis(>0) eingeben:");
		

		einzelpreis=(100-rabatt)/100*fahrkartenpreis;
		gesamtpreis=einzelpreis*fahrkartenzahl;
		
		System.out.println("Einzelpreis: "+einzelpreis);
		System.out.println("Gesamtpreis: "+gesamtpreis);

	}

}
