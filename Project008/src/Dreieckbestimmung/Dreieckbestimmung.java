package Dreieckbestimmung;

public class Dreieckbestimmung {
	int a, b, c;
	double eps = 0.0001;//

	Dreieckbestimmung() {
	}

	Dreieckbestimmung(int aa, int bb, int cc) {
		a = aa;
		b = bb;
		c = cc;
	}

	public void setzen(int aa, int bb, int cc) {
		a = aa;
		b = bb;
		c = cc;
	}

	public void drucken() {
		System.out.printf("%na=%3d%nb=%3d%nc=%3d%n", a, b, c);
	}

//	double eps = 0.0001;

//double a = 3.0, b = 3.0, c = 3.0;//gleichseitig
//double a = 3.0, b = 4.0, c = 5.0;//rechwinkelig
//double a = 3.0, b = 3.0, c = 4.0;//gleichschenkelig
//double a = 0.0, b = 0.0, c = 0.0;// kein dreieck
//double a = 3.0, b = 7.0, c = 4.0;// degeneriertes
//double a = 3.0, b = 8.0, c = 4.0; // kein dreieck
//double a = 3.0, b = 3.0, c = 3.0* Math.sqrt(2); //gleichschenkelig rechtwinkelig
//double a = 2.0, b = 3.0, c = 4.0;//rechwinkelig
//double a = 3.0, b = 6.0, c = 4.0;  //allgemein

//System.out.printf("a:%9.2f b:%9.2f c:%9.2f \n",a,b,c);  // %d int %c char %s String
//	System.out.println("a:"+a+" b:"+b+" c:"+c);
//	System.out.println("aa+bb:"+(a*a+b*b)+" cc:"+c*c);
	public boolean istDreieck() {
		return ((a + b > c) && (b + c > a) && (c + a > b)); // dreieck?(aa, bb, cc)
	}

	public boolean istgleichseitig() {
		return (a == b && b == c); // gleichseitig?(aa, bb, cc)
	}

	public boolean istgleichschenkelig() {
		return ((a == b) || (b == c) || (c == a)); // gleichschenkelig?(aa, bb, cc)
	}

	public boolean istrechtwinkelig() {
		return ((Math.abs(a * a + b * b - c * c) < eps) || (Math.abs(a * a + c * c - b * b) < eps)
				|| (Math.abs(b * b + c * c - a * a) < eps));// rechtwinkelig?(aa, bb, cc)
	}

	public boolean istdegeneriert() {
		return ((Math.abs(a + b - c) < eps) || (Math.abs(a + c - b) < eps) || (Math.abs(b + c - a) < eps));

	}

	public void dreieck_bestimmen() {
//	System.out.println("a:"+a+" b:"+b+" c:"+c);
//    System.out.println("aa+bb:"+(a*a+b*b)+" cc:"+c*c);
		if (istDreieck())
			if (istgleichseitig())
				System.out.println("Das ist ein gleichseitiges Dreieck");
			else {
				if (istgleichschenkelig()) {
					System.out.println("Das ist ein gleichschenkeliges Dreieck\n");
					if (istrechtwinkelig())
						System.out.println("Das ist ein rechtwinkeliges Dreieck");
				} else {
					if (istrechtwinkelig()) {
						System.out.println("Das ist ein rechtwinkeliges Dreieck");
						System.out.println(a + b - c);
						System.out.println(a + c - b);
						System.out.println(b + c - a);
					} else
						System.out.println("Das ist ein allgemeines Dreieck");

				}
			}
		else if (istdegeneriert())
			System.out.println("Das ist ein degeneriertes Dreieck");
		else
			System.out.println("Das ist kein Dreieck");

	}

	double calcFlaeche() {
		double s = (a + b + c) / 2; // semiperimeter
		double flaeche = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heronfläche
		// das berechnete Ergebnis zurückliefern
		return flaeche;
	}

	double calcUmfang() {
		double umfang = a + b + c;
		// das berechnete Ergebnis zurückliefern
		return umfang;

	}

}
