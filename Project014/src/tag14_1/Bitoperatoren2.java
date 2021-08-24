package tag14_1;

public class Bitoperatoren2 {

	public static void main(String[] args) {
		int maske = 0b1;
		int a = 0b10110101;
		long along = 0b110110101L; // 2^i .... 2^2 2^1 2^0
		System.out.printf("%d  %s  %s%n", a, Integer.toBinaryString(a), Integer.toHexString(a));
		System.out.printf("%d  %s %s%n", along, Long.toBinaryString(along), Long.toHexString(along));
		ausgabe(maske, a, a & maske, "a&maske");
		maske = 0b11111111;
		ausgabe(maske, a, a & maske, "a&maske");
		maske = 0b11111011; // Maske mit null 3.bit löscht 3.bit
		ausgabe(maske, a, a & maske, "a&maske");

		maske = 0b11011111; // Maske mit null 6.bit löscht 6.bit
		ausgabe(maske, a, a & maske, "a&maske");

		maske = 0b1000;
		ausgabe(maske, a, a | maske, "a|maske");
		// nicht ~ not
//		System.out.printf("%n~maske%n%16s%n", Integer.toBinaryString(~maske));
		ausgabe(maske, a, ~maske, "~maske");
// XOR
		maske = 0b00001111;
		a = 0b11000011;
		ausgabe(maske, a, a ^ maske, "a^maske");

// simuliere xor mit und oder und nicht  (& | ~)			
// ergebnisbit 1 wenn (a==1 und maske==0) oder (a==0 und maske==1)			
		ausgabe(maske, a, (a & ~maske) | (~a & maske), "(a&~maske)|(~a&maske)");

		a = 0b1;
		ausgabe(0, a, (a << 1), "(a<<1 shift left");
///	ausgabe(0,a,(a<<31)  ,"(a<<31 shift left");	
		for (int i = 1; i < 32; i++) {
			ausgabe(0, a, (a << i), "(a<<" + i + " shift left");
		}
		a = 0b1 << 31;
		for (int i = 1; i < 32; i++) {
			ausgabe(i, a, (a >> i), "(a>>" + i + " shift right");
		}
		a = 0b1 << 15;
		for (int i = 1; i < 8; i++) {
			ausgabe(i, a, (a >> i), "(a>>" + i + " shift right)");
		}
		a = 0b1 << 30;
		for (int i = 1; i < 8; i++) {
			ausgabe(i, a, (a >> i), "(a>>" + i + " shift right)");
		}

		a = 255;
		System.out.printf("1:  %32s%32s", Integer.toBinaryString(a), Integer.toBinaryString(a << 1));
		System.out.printf("%n2:   %4d%4d", a, a << 1); // shift left 1bit ist multiplikation *2
		System.out.printf("%n3:   %4d%4d%n", a, a >> 1); // shift right 1bit ist division /2
		// test eigene methode tobinarystring
		a = 56;
		System.out.printf("4:%32s%32s%n", tobinarystring(a), Integer.toBinaryString(a));
		String erg = tobinarystring(a);
		// erg.replace('0','');
		// erg.trim();
		// system.out.println(erg);

		int i = erg.indexOf('1');
		erg = erg.substring(i, erg.length());
		System.out.println(erg);
		System.out.printf("%n%32s%n%32s%n", tohexstring(a), Integer.toHexString(a));

	}

	public static void ausgabe(int imaske, int ia, int iergebnis, String ausgabetext) {
		System.out.printf("%n%s%na       =%32s%nmaske   =%32s%nergebnis=%32s%n", ausgabetext,
				Integer.toBinaryString(ia), Integer.toBinaryString(imaske), Integer.toBinaryString(iergebnis));
	}

	public static String tobinaryString000(int eingabe) {
		int imaske = 1;
		String ergebnis = "";
		for (int i = 0; i < 31; i++) {
			if (((imaske << i) & (eingabe)) != 0) // if(eingabe!=0){ergebnis=(imaske&eingabe)
				ergebnis = "1" + ergebnis; // +ergebnis; eingabe>>=1;
											// return ergebnis;
			else
				ergebnis = "0" + ergebnis;
		}
		return ergebnis;
	}

	public static String tobinarystring(int eingabe) {
		String ergebnis = tobinaryString000(eingabe);
		int i = ergebnis.indexOf('1');
		return ergebnis.substring(i, ergebnis.length());
	}

	public static String tohexstring(int eingabe) {
		String ergebnis = "";
		int mask = 15;
		char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int idx;
		for (int i = 0; i < 8; i++) {
			if (eingabe != 0) {
				idx = eingabe & mask;
				ergebnis = hex[idx] + ergebnis;
			}
			eingabe >>= 4;
		}
		return ergebnis;
	}

}
