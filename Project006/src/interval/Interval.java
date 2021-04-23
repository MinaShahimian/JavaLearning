package interval;

import Prog1Tools.IOTools;

public class Interval {

	public static void main(String[] args) {
		int startStunde, startMinuten;
		int endStunde, endMinuten;
		int gesamtStart = 0;
		int gesamtende = 0;

		startStunde = IOTools.readInt("startStunde:");
		if (iststunde(startStunde))
			System.out.println("");

		startMinuten = IOTools.readInt("startMinuten:");
		if (istminuten(startMinuten))
			System.out.println();

		endStunde = IOTools.readInt("endStunde:");
		if (iststunde(endStunde))
			System.out.println();
		endMinuten = IOTools.readInt("endMinuten:");
		if (istminuten(endMinuten))
			System.out.println();

		gesamtStart = startStunde * 60 + startMinuten;
		gesamtende = endStunde * 60 + endMinuten;

		System.out.printf("Start: %d:%d %n",startStunde,startMinuten);
		System.out.printf("End: %d:%d %n",endStunde,endMinuten);
		
		
		while (gesamtStart < gesamtende) {
			gesamtStart += 5;
  		System.out.print(gesamtStart/60);
			System.out.println(" : "+gesamtStart%60);
		}

	}

	public static boolean iststunde(int zeit) {
		if (zeit >0 && zeit > 23) {
			System.out.println(false);
		}
		return true;
	}

	public static boolean istminuten(int zeit) {
		if (zeit> 0 && zeit > 59)
			System.out.println(false);

		return true;
	}
}
