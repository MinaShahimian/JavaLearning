package tag16_1;

public class kommandozeile {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.printf("%2d -%20s%n", i, args[i]);
		}
		System.out.println();
		for (String a : args) {
			System.out.printf("%s%n", a);
		}

		System.out.println("**ENDE**"); // /? -
	}

}
