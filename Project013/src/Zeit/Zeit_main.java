package Zeit;

import Prog1Tools.IOTools.*;

public class Zeit_main {

	public static void main(String[] args) {
//      SekundenZeit Abfahrt = new SekundenZeit(11,15);
		SekundenZeit Abfahrt = new SekundenZeit(11, 15, 30);
//       Abfahrt.Setzen(11, 15);
//       Abfahrt.einlesen();
		Abfahrt.Ausgabe("Abfahrt: "); // anzeigen
		SekundenZeit Ankunft = new SekundenZeit(19, 32, 47);
//       SekundenZeit Ankunft = new SekundenZeit(19, 32);
//     Ankunft.Setzen(19, 32);
//       Ankunft.einlesen();

		Ankunft.Ausgabe("Ankunft: ");

		SekundenZeit Fahrzeit = new SekundenZeit();
		Fahrzeit.Setzen(Ankunft.gesamtsekunden() - Abfahrt.gesamtsekunden());
		Fahrzeit.Ausgabe("Fahrzeit:");

		Abfahrt.Addieren(Fahrzeit.gesamtsekunden());
		Abfahrt.Ausgabe("Ankunft: ");

	}

}
