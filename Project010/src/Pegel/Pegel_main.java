package Pegel;

public class Pegel_main {

	public static void main(String[] args) {
		//Pegelwert p1 = new Pegelwert(7.568, "14:15");
        //p1.Ausgabe();

        // bis zu 10 Pegelwerte
        Pegelwert[] pegel = new Pegelwert[] 
        {
            new Pegelwert(12.78, "12:15"),
            new Pegelwert(14.22, "10:45"),
            new Pegelwert(10.55, "18:33"),
            new Pegelwert(15.01, "02:40"),
            new Pegelwert(9.7, "22:02"),
            null, null,
            null, null,
            null
        };

        // Benutzer gibt Wert und Zeit ein
        // bei -1 => Ende
        /*double wert;
        string zeit;
        int index = 0;
        do
        {
            Console.Write("Messwert (-1 für Ende): ");
            wert = double.Parse(Console.ReadLine());
            if (wert != -1)
            {
                Console.Write("Zeit: ");
                zeit = Console.ReadLine();
                // neues Objekt im Vektor anlegen
                pegel[index++] = new Pegelwert(wert, zeit);
            }
        } while (wert != -1 && index < pegel.Length);
        */
        for (Pegelwert p : pegel)
        {
            if (p != null)
                p.Ausgabe();
        }
        // den niedrigsten Pegel finden und ausgeben
        int niedrigIndex = 0;   // erstes Element
        for (int i=1; i <pegel.length; i++)
        {
            if (pegel[i] == null)   // Prüfung auf leere Einträge
                continue;
            // Vergleiche Pegelstand an aktueller Position i
            // mit Pegelstand an bisheriger niedrigster Position
            if (pegel[i].GetPegelstand() < pegel[niedrigIndex].GetPegelstand())
                niedrigIndex = i;   // besseren merken
        }
        System.out.printf("%nNiedrigster Wert: ");
        pegel[niedrigIndex].Ausgabe();

        // den ältesten Pegel finden und ausgeben
        Pegelwert ältester = pegel[0];  // Referenz auf 1. Element
        for (Pegelwert p : pegel)
        {
            if (p == null)
                continue;
            // Zeiten vergleichen
            if (p.GetMesszeit().GesamtMinuten() <
                        ältester.GetMesszeit().GesamtMinuten())
                ältester = p;
        }
        System.out.printf("%nÄltester Wert: ");
        ältester.Ausgabe();

}	

}
