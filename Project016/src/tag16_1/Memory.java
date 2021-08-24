package tag16_1;

import java.util.Arrays;
import java.util.Random;

public class Memory {
	public final static boolean auf = true;
	public final static boolean zu = false;
	int zeilen;
	int spalten;
	int[] bilder;
	boolean[] aufgedeckt;

	public Memory(int zeilen, int spalten) {
		this.zeilen = zeilen;
		this.spalten = spalten;
		bilder = new int[zeilen * spalten];
		aufgedeckt = new boolean[zeilen * spalten];
		for (int i = 0; i < bilder.length; i++) {
			bilder[i] = (i + 1) / 2;
			aufgedeckt[i] = false;
		}
//	    for (int i = 0; i < bilder.length; i++) {
//			 bilder[i]=(i+1) / 2;
//			 aufgedeckt[i]=false;
//		}
		// durchmischen
		for (int i = 0; i < bilder.length - 1; i++) {
			if (bilder[i] == bilder[i + 1]) {
				tauschen(i + 1, (i + 2 + zufall()) % zeilen * spalten);
			}
		}

	}

	public void unverdeckt_ausgeben() {
		for (int i = 0; i < bilder.length; i++) {
			System.out.printf("%03d ", bilder[i]);
			if ((i + 1) % spalten == 0)
				System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	public void ausgeben() {
		for (int i = 0; i < bilder.length; i++) {
			if (aufgedeckt[i])
				System.out.printf("%03d ", bilder[i]);
			else
				System.out.printf("%3s ", "***");
			if ((i + 1) % spalten == 0)
				System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	private void tauschen(int idxa, int idxb) {
		int hilf;
		if (Math.abs(idxa - idxb) > 1) {
//		  System.out.printf("%3d %3d %n", idxa,idxb);	  
			hilf = bilder[idxa];
			bilder[idxa] = bilder[idxb];
			bilder[idxb] = hilf;
		}
	}

	private int zufall() {
		double h = Math.random();
		return (int) (h * zeilen * spalten);
	}

	public int aufdecken(int x, int y, boolean auf) {
		int idx = y * spalten + x;
		aufgedeckt[idx] = auf;
		return bilder[idx];
	}

}
