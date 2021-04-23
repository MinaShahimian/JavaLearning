package PrimZahl;

import static Prog1Tools.IOTools.*;

public class PrimZahl {

	public static void main(String[] args) {
		int x = 0;
		//char antwort;

		x = readInt("bitte die zahl eingeben:");
		if (Istprimzahl(x))
			System.out.printf("zahl %d ist primzahl%n", x);
		else
			System.out.printf("zahl %d ist Keine primzahl\n", x);
		for (int k = 2; k < x; k++)
     		if (Istprimzahl(k))
			System.out.printf("zahl %d ist primzahl%n", k);

	}

	public static boolean Istprimzahl(int n) {

		for (int i = 2; i < n; i++)
			if (n % i == 0)

				return false;
		return true;
	}

}
