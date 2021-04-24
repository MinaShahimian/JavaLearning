package Interval;

public class Intervall_main {

	public static void main(String[] args) {
		Intervall i1=new Intervall(5,20);
		Intervall i2=new Intervall(15,25);
		Intervall i3=new Intervall(6,10);
		Intervall i4=new Intervall(0,26);

		i1.drucken("i1 ");
		i2.drucken("i2 ");
		i3.drucken("i3 ");
		i4.drucken("i4 ");
		System.out.println("");

		System.out.printf("%s contains %d   %s\n","i4",-5,i4.contains(-5));
		System.out.printf("%s contains %d   %s\n","i4",5,i4.contains(5));
		
		System.out.printf("%s contains %s   %s\n","i4","i1",i4.contains(i1));
		System.out.printf("%s contains %s   %s\n","i3","i1",i3.contains(i1));
		System.out.printf("%s contains %s   %s\n","i2","i4",i2.disjoint(i4));

		
		
		Intervall i5=i1.intersection(i2);
		System.out.printf("%s intersection %s   %s\n","i2","i1",i5.sout());


	}

}
