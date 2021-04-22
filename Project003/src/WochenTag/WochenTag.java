package WochenTag;

public class WochenTag {

	public static void main(String[] args) {
		
		int tagnr=5;
		switch (tagnr) {
		case 1: System.out.println("Montag");
		break;
		case 2: System.out.println("Dienstag");
		break;
		case 3: System.out.println("Mittwoch");
		break;
		case 4: System.out.println("Donerstag");
		break;
		case 5: System.out.println("Freitag");
		break;
		case 6: System.out.println("Samstag");
		break;
		case 7: System.out.println("Sontag");
		break;
		default : System.out.println("Falche Wochentag");
		
		}
		
		
		//Andere Variante
		
		if (tagnr==1) {
			System.out.println("Montag");
		}
		else if(tagnr==2) {
			System.out.println("Dienstag");
		}
		else if(tagnr==3) {
			System.out.println("Mittwoch");
		}
		else if(tagnr==4) {
			System.out.println("Donerstag");
		}
		else if(tagnr==5) {
			System.out.println("Freitag");
	    }
		else if(tagnr==6) {
		System.out.println("Samstag");
		}
		else if(tagnr==7) {
			System.out.println("Sontag");
		}
		else System.out.println("Falche Wochentag");
}
}







