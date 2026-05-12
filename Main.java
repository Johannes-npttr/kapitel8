
/**
 * Beschreiben Sie hier die Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main
{
    public static void main(String args[])
    {
        int summe = 0;

        int obereGrenze = 10;
        for(int i = 1; i<=obereGrenze; i++)
        {
            summe += i;
        }
        
        System.out.println("Summe =" + summe);
    }
}
