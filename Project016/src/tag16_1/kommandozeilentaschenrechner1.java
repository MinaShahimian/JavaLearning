package tag16_1;

public class kommandozeilentaschenrechner1 {

	public static void main(String[] args) {
		int zahl1;
		int zahl2;
		double ergebnis = 0.0;

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println();

		if (args.length == 3) {
			String op = args[1];
			zahl1 = Integer.parseInt(args[0]);
			System.out.println("zahl1:");
			zahl2 = Integer.parseInt(args[2]);
			System.out.println("zahl2:");

			switch (op) {
			case "+":
				ergebnis = zahl1 + zahl2;
				break;
			case "-":
				ergebnis = zahl1 - zahl2;
				break;
			// case "*": liefert falsche parameterliste
			case "x":
				ergebnis = zahl1 * zahl2;
				break;
			case "/":
			case ":":
				ergebnis = zahl1 / zahl2;
				break;

			default:
				System.out.println("'programm zahl1 [+-*x/:] zahl2' falscher operator-" + op);
				break;

			}
			System.out.printf("%d%s%d=%10.2f%n", zahl1, op, zahl2, ergebnis);

		} else
			System.out.println("'programm zahl1 operator zahl2' und nichts anderes!!!");

	}

}
