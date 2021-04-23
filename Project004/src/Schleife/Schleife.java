package Schleife;

public class Schleife {

	public static void main(String[] args) {

		// 2,4,6,8.....30

		/*
		 * int i = 0; while (i < 30) { i += 2; System.out.printf("%d  ", i);
		 * 
		 * } System.out.println(""); for (i = 2; i <= 30; i += 2) {
		 * System.out.printf("%d  ", i); } System.out.println(""); i = 2; do {
		 * System.out.printf("%d  ", i); i += 2; } while (i <= 30);
		 * 
		 * System.out.println("");
		 * 
		 * for (i = 20; i >= 0; i -= 3) { System.out.printf("%d  ", i); }
		 * System.out.println("");
		 * 
		 * long l; for (l = 1, i = 0; l < 500000; i++, l *= 2) { for (l = 1, i = 0; i <=
		 * 32; i++, l *= 2) { System.out.printf("%2d  %10d%n", i, l); }
		 * 
		 * }
		 * 
		 * for(l=1,i=0;l<100;i+=2,l+=2) { for(l=1,i=0;i<=100;i+=2,l+=2) {
		 * System.out.printf("%10d  %10d%n",i,l); } }
		 */

		// Baum

		int i = 0;
		int krone = 8;
		int stamm = 5;
		int mitte = 10;
		int zeile = 1;
		int breite = 1;
		// krone
		for (zeile = 1; zeile <= krone; zeile++) {
			for (i = 1; i < mitte - zeile; i++)
				System.out.print(" ");
			for (i = 1; i <= breite; i++)
				System.out.print("*");
			System.out.println("");
			breite += 2;
		}

		// stamm
		for (zeile = 1; zeile <= stamm; zeile++) {
			for (i = 1; i < mitte - 1; i++)
				System.out.print(" ");
			System.out.println("*");

		}
		
		
		int kopf=8;
		int korper=20;
		int zw=30;
		int size=8;
		//kopf
			for(zeile=1;zeile<=kopf;zeile++) {
			for(i=1;i<zw-kopf;i++) 
				System.out.print(" ");
				  for(i=1;i<=size;i++)
				     System.out.print("*");
				System.out.println(" ");
				size--;
			}
		
		for(zeile=1;zeile<=korper;zeile++) {
			for(i=1;i<zw-korper;i++) 
				System.out.print(" ");
				  for(i=1;i<=size;i++)
				     System.out.print("*");
				System.out.println(" ");
				size--;
		
	
		
		
		
		}

	}}
