package BitOperatoren;

public class Bitoperatoren {

	public static void main(String[] args) {
		int maske = 0b1;
		int a = 0b10110101;
		long along = 0b110110101L; // 2^i .... 2^2 2^1 2^0
		System.out.printf("%d  %s  %s%n", a, Integer.toBinaryString(a), Integer.toHexString(a));
		System.out.printf("%d  %s %s%n", along, Long.toBinaryString(along), Long.toHexString(along));
		System.out.printf("%na&maske%n%16s%n%16s%n%16s%n", Integer.toBinaryString(a), Integer.toBinaryString(maske),
				Integer.toBinaryString(a & maske));
		maske = 0b11111111;
		System.out.printf("%na&maske%n%16s%n%16s%n%16s%n", Integer.toBinaryString(a), Integer.toBinaryString(maske),
				Integer.toBinaryString(a & maske));
		maske = 0b11111011; // Maske mit null 3.bit löscht 3.bit
		System.out.printf("%na&maske%n%16s%n%16s%n%16s%n", Integer.toBinaryString(a), Integer.toBinaryString(maske),
				Integer.toBinaryString(a & maske));
		maske = 0b11011111; // Maske mit null 6.bit löscht 6.bit
		System.out.printf("%na&maske%n%16s%n%16s%n%16s%n", Integer.toBinaryString(a), Integer.toBinaryString(maske),
				Integer.toBinaryString(a & maske));
		maske = 0b1000; // maske 4.bit setzen
		System.out.printf("%na|maske%n%16s%n%16s%n%16s%n", Integer.toBinaryString(a), Integer.toBinaryString(maske),
				Integer.toBinaryString(a | maske));

		System.out.printf("%n~maske%n%16s%n", Integer.toBinaryString(~maske));

	}

}
