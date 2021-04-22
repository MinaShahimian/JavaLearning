package Dreiecksbestimmung;

import Prog1Tools.IOTools.*;

public class Dreiecksbestimmung {

	public static void main(String[] args) {
		double eps = 0.0001;

		//double a = 3.0, b = 3.0, c = 3.0;//gleichseitig
		//double a = 3.0, b = 4.0, c = 5.0;//rechwinkelig
		//double a = 3.0, b = 3.0, c = 4.0;//gleichschenkelig
		//double a = 0.0, b = 0.0, c = 0.0;// kein dreieck
		//double a = 3.0, b = 7.0, c = 4.0;// degeneriertes
		double a = 3.0, b = 8.0, c = 4.0; // kein dreieck
		//double a = 3.0, b = 3.0, c = 3.0* Math.sqrt(2); //gleichschenkelig rechtwinkelig
		//double a = 2.0, b = 3.0, c = 4.0;//rechwinkelig
		//double a = 3.0, b = 6.0, c = 4.0;  //allgemein

		//a = IOTools.readDouble("Bitte die Länge der Seite A eingeben:");
		//b= IOTools.readDouble("Bitte die Länge der Seite B eingeben:");
		//c= IOTools.readDouble("Bitte die Länge der Seite C eingeben:");

		//System.out.printf("a:%9.2f b:%9.2f c:%9.2f \n",a,b,c);  // %d int %c char %s String
				System.out.println("a:"+a+" b:"+b+" c:"+c);
				System.out.println("aa+bb:"+(a*a+b*b)+" cc:"+c*c);
		if ((a + b>c) && (b + c>a) && (c + a>b)) //dreieck?(aa, bb, cc)
			if (a == b && b == c )  //gleichseitig?(aa, bb, cc)
				System.out.println( "Das ist ein gleichseitiges Dreieck");
			else
			{
				a = a * a;
				b = b * b;
				c = c * c;
				if ((a == b) || (b == c) || (c == a))  //   gleichschenkelig?(aa, bb, cc)
				{
					System.out.println("Das ist ein gleichschenkeliges Dreieck\n");
					if ((Math.abs(a + b - c)<eps) || (Math.abs(a + c - b) <eps) || (Math.abs(b + c - a) < eps))//rechtwinkelig?(aa, bb, cc)
						System.out.println("Das ist ein rechtwinkeliges Dreieck");
				}
				else
				{
					if((Math.abs(a + b - c)<eps) || (Math.abs(a + c - b) <eps) || (Math.abs(b + c - a) < eps))//  rechtwinkelig?(aa, bb, cc)
					{					System.out.println("Das ist ein rechtwinkeliges Dreieck");
					System.out.println(a + b - c);
					System.out.println(a + c - b);
					System.out.println(b + c - a);
					}else
						System.out.println("Das ist ein allgemeines Dreieck");

				}
			}
		else
			if ((Math.abs(a + b - c)<eps) || (Math.abs(a + c - b) <eps) || (Math.abs(b + c - a) < eps))
				System.out.println("Das ist ein degeneriertes Dreieck");
			else
				System.out.println("Das ist kein Dreieck");

	}}

/*
 * if (seita == seitb && seitb == seitc)
 * System.out.println("Das ist ein rechwinkeliges:");
 * 
 * if (seitb == seitc || seitb == seita || seita == seitc)
 * System.out.println("Das ist ein gleichschenkeliges Dreieck.");
 * 
 */
