package Hund;

public class Hund_main {

	public static void main(String[] args) {

		Hund h1 = new Hund("Spike", 1234, "Bulldog");
		System.out.printf("Hund %s zahlt %d,00 €%n", h1.GetName(), h1.GetBasisSteuer());
		System.out.println("Rasse: " + h1.GetRasse());
		Wachhund h2 = new Wachhund("Rex", 6767889, "Schäferhund", "WIFI C412");
		System.out.printf("Hund %s in %s zahlt %d,00 €%n", h2.GetName(), h2.GetEinsatzort(), h2.BerechneSteuer());
		System.out.println("Rasse: " + h2.GetRasse());
		Kuschelhund h3 = new Kuschelhund("Flauschi", 456452, "Golden Retriever", 999);
		System.out.printf("Hund %s Flauschigkeit: %d zahlt %d,00 €%n", h3.GetName(), h3.GetPlueschfaktor(),
				h3.BerechneSteuer());
		System.out.println("Rasse: " + h3.GetRasse());

	}

}
