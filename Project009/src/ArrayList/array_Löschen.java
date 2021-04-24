package ArrayList;

public class array_Löschen {

	public static void main(String[] args) {

		int[] zahlen = {1,5,8,2,34,23,11,67,45,100,0,0,0,0,0,0,0,0,0,0};
		int anzahl = 5;
		System.out.println("Anzahl:  "+anzahl);
		ausgabe("zahlen:               ",zahlen,anzahl);	
		anzahl=loeschen(zahlen,2,anzahl);
		ausgabe("zahlen nach loeschen: ",zahlen,anzahl);
		System.out.println("Anzahl "+anzahl);	
	}
	
	
	// löschen einer zahl an bestimmter position
	public static int loeschen(int[] z,int pos,int anz) {
	    if (pos<0||pos>=anz) 
	    	return anz;
	    for (int i = pos+1; i < z.length; i++) {
			z[i-1]=z[i];
		} 
	    return anz-1;
	}

	
	
	public static void ausgabe(String ausgabetext,int[] z,int anz) {
		System.out.print(ausgabetext);
		for (int idx=0;idx<anz;idx++) {
		   System.out.printf("%4d  ",z[idx]);
	    }
		System.out.println("");
	}	

	public static void ausgabe(String ausgabetext,int[] z) {
		System.out.print(ausgabetext);
		for (int zahl : z) {
		   System.out.printf("%4d  ",zahl);
	    }
		System.out.println("");
	}	


}
