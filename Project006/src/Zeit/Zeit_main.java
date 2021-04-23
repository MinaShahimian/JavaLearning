package Zeit;
import Prog1Tools.IOTools.*;
public class Zeit_main {

	public static void main(String[] args) {



        Zeit Abfahrt = new Zeit(11,15);
 //       Abfahrt.Setzen(11, 15);
//        Abfahrt.einlesen();
        Abfahrt.Ausgabe( "Abfahrt:");   // anzeigen

        Zeit Ankunft = new Zeit(19, 32);
 //     Ankunft.Setzen(19, 32);
        Ankunft.einlesen();
      
        Ankunft.Ausgabe("Ankunft:");
     
        Zeit Fahrzeit = new Zeit();
        Fahrzeit.setzen_gesamtminuten(Ankunft.gesamtminuten()-Abfahrt.gesamtminuten());
        Fahrzeit.Ausgabe("Fahrzeit:");
	}

}
