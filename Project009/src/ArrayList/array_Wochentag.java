package ArrayList;

public class array_Wochentag {

	public static void main(String[] args) {

		int tagnr = 3;
		final String di = "Dienstag";
		String mi = "Mittwoch";
		String[] wochentage = { "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag" };
		System.out.printf("Wochentag %d %s%n ", tagnr, wochentage[tagnr - 1]);

		// Vergleich von strings
		System.out.println("ist Dienstag " + (wochentage[1] == di));
		System.out.println("ist Dienstag " + (wochentage[1] == "Dienstag"));
		System.out.println("ist Dienstag " + (wochentage[1].equals(di)));
		// position von dienstag
		System.out.println("ist Dienstag " + indexof(wochentage, di));
		System.out.println("ist Mittwoch " + indexof(wochentage, "Mittwoch"));
		System.out.println("Nr ist Dienstag " + wochentagnr(wochentage, di));
		System.out.println("Nr ist Mittwoch " + wochentagnr(wochentage, "Mittwoch"));

	}

	public static int wochentagnr(String[] texte, String such) {
		return indexof(texte, such) + 1;
	}

	public static int indexof(String[] texte, String such) {
		// int pos=-1;
		such = such.toLowerCase();
		String s1;
//			  System.out.println(such);
		for (int i = 0; i < texte.length; i++) {
			s1 = texte[i].toLowerCase();
//				  System.out.println(s1);
			if (s1.equals(such))
				return i;
		}

		return -1;
	}

}
