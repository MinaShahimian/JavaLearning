package FahrZeit;

import static Prog1Tools.IOTools.*;

public class fahrzeit {

	public static void main(String[] args) {

		int AbfahrtStunden, AbfahrtMinuten;
		int AnkunftStunden, AnkunftMinuten;
		int AbfahrtGesamt, AnkunftGesamt;

		AbfahrtStunden = ZeitEingabe("Abfahrtszeit Stunden (0-23) :", 23);

		AbfahrtMinuten = ZeitEingabe("Abfahrtszeit Minuten (0-59) :", 59);

		AnkunftStunden = ZeitEingabe("Ankunftzeit Stunden (0-23) :", 23);

		AnkunftMinuten = ZeitEingabe("Ankunftzeit Minuten (0-59) :", 59);
		
		AbfahrtGesamt = BerechneGesamtMinuten(AbfahrtStunden, AbfahrtMinuten);
		AnkunftGesamt = BerechneGesamtMinuten(AnkunftStunden, AnkunftMinuten);
		
		if (AbfahrtGesamt > AnkunftGesamt) {
			System.out.println("Fehler: Abfahrt nach Ankunft");
			return;
		}

		int ReisezeitGesamt = AnkunftGesamt - AbfahrtGesamt;
		int ReisezeitStunden = ReisezeitGesamt / 60;
		int ReisezeitMinuten = ReisezeitGesamt % 60;
		System.out.println("Reisezeit ist " + ReisezeitStunden + ":" + ReisezeitMinuten);

	}

	static int BerechneGesamtMinuten(int stunden, int minuten) {
		int gesamt = minuten + stunden * 60;
		return gesamt; 
	}

	static boolean PruefeStunden(int stunden) {
		if (stunden < 0 || stunden > 23) {
			System.out.println("Ungültiger Stundenwert (0 bis 23 zulässig)");
			return false;
		}
		return true;
	}

	static boolean PruefeMinuten(int minuten) {
		if (minuten < 0 || minuten > 59) {
			System.out.println("Ungültiger Minutenwert (0 bis 59 zulässig)");
			return false;
		}
		return true;
	}

	//wenn der Zeit falsch eingeben werden, wieder zeigt die Frage
	
	static int ZeitEingabe(String aufforderungstext, int obergrenze) {
		int zeit;
		do {
			zeit = readInt(aufforderungstext);
		} while (zeit < 0 || zeit > obergrenze);
		return zeit;

	}

}
