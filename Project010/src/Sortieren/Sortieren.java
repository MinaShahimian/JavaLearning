package Sortieren;

public class Sortieren {

	public static void main(String[] args) {

		int[] zahlen = new int[20];
		boolean aufsteigend_sortiert = true;
		boolean absteigend_sortiert = true;

//		System.out.println("aufsteigend sortiert  z[i]<=z[i+1]   ");
//		initialisieren(zahlen);
//		ausgabe(zahlen);
//		System.out.println("absteigend sortiert z[i]>=z[i+1] ");
//		verkehrt_initialisieren(zahlen);
//		ausgabe(zahlen);
		System.out.println("unsortiert  z[i]<=z[i+1] gilt nicht überall   ");
		zufall_initialisieren(zahlen);
		ausgabe(zahlen);
		

		initialisieren(zahlen);
		ausgabe(zahlen);
		
		verkehrt_initialisieren(zahlen);
		ausgabe(zahlen);

		for (int i = 0; i < zahlen.length - 1; i++) {
			aufsteigend_sortiert = (zahlen[i] <= zahlen[i + 1]) && aufsteigend_sortiert;
			absteigend_sortiert = (zahlen[i] >= zahlen[i + 1]) && absteigend_sortiert;
		}

		if (aufsteigend_sortiert)
			System.out.println("aufsteigend sortiert  ");
		else if (absteigend_sortiert)
			System.out.println("absteigend sortiert");
		else
			System.out.println("unsortiert  ");
		// bubblesort O(N*N) quicksort mergesort O(ldN*N)
		bubblesort(zahlen);
		// Arrays.sort(zahlen);
		 ausgabe(zahlen);
		if (aufsteigend_sortiert(zahlen))
			System.out.println("aufsteigend sortiert  ");

	}

	public static void bubblesort(int[] z) {
		int hilf;
		boolean aufsteigend_sortiert;
		do {
			aufsteigend_sortiert = true;
			for (int i = 0; i < z.length - 1; i++) {
				if (z[i] > z[i + 1]) { // zwei zahlen tauschen
					hilf = z[i];
					z[i] = z[i + 1];
					z[i + 1] = hilf;
					aufsteigend_sortiert = false;
				}
			}
			ausgabe(z);
		} while (aufsteigend_sortiert == false);
	}

	public static void ausgabe(int[] z) {
		for (int i = 0; i < z.length; i++) {
			System.out.printf("%4d", z[i]);

		}
		System.out.println();
	}

	public static void initialisieren(int[] z) {
		for (int i = 0; i < z.length; i++) {
			z[i] = i * 3 + 1;
			// (int) cast, aus double mach int
		}
	}

	public static void zufall_initialisieren(int[] z) {
		for (int i = 0; i < z.length; i++) {
			z[i] = (int) ((Math.random() * 500.0) + 1.0);
			// (int) cast, aus double mach int
		}
	}

	public static void verkehrt_initialisieren(int[] z) {
		for (int i = 0; i < z.length; i++) {
			z[i] = (z.length - i) * 3 + 1;

		}
	}

	public static boolean aufsteigend_sortiert(int[] z) {
		boolean aufsort = true;
		for (int i = 0; i < z.length - 1; i++)
			aufsort = (z[i] <= z[i + 1]) && aufsort;
		return aufsort;
	}

	public static boolean absteigend_sortiert(int[] z) {
		boolean absort = true;
		for (int i = 0; i < z.length - 1; i++)
			absort = (z[i] >= z[i + 1]) && absort;
		return absort;
	}

}
