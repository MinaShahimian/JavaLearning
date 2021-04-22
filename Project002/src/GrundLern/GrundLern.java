package GrundLern;

public class GrundLern {

	public static void main(String[] args) {
		

		System.out.print("Eins ");
		System.out.print("Zwei ");
		System.out.println("Hallo World");

		int a=1;
		int b=2;
		int flaeche1=a*b;
		System.out.printf("a:%d",a);
		System.out.printf("    b:%d     \n",b);
		System.out.println("Fläche1=a*b:"+ flaeche1+ "m^2");
		a++;
		b++;
		int flaeche2=a*b;
		int flaeche3=2%a+2%b;
		System.out.println("Fläche2=a*b:"+ flaeche2+ "m^2");
		System.out.println("Fläche3=2%a+2%b:"+ flaeche3+ "m^2");
		int umfang=2*a+2*b;
		System.out.println("umfang:"+umfang+"m");
		System.out.printf("umfang:%dm  ", umfang);
		System.out.println("a<b: "+(a<b));
		System.out.println("a>b: "+ (a>b));
		if (a<b) {
			System.out.println("a<b: true");
		}
		else {System.out.println("a>b");
	}
		
		
		int i=5;
		while(i<=10) {
			int j=i+20;
			i++;
			System.out.println("du kannst anmelden."+j);
		}

	}

}
