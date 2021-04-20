
/**
 * Beschreiben Sie hier die Klasse Dorf.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Dorf
{
    Gebaeude dorfgebaeude[] = new Gebaeude[7];
    
    public Dorf()
    {
        dorfgebaeude[0] = new Gebaeude(10, 5);
        dorfgebaeude[1] = new Gebaeude(8, 10);
        dorfgebaeude[2] = new Gebaeude(12, 13);
        dorfgebaeude[3] = new Gebaeude(4, 4);
        dorfgebaeude[4] = new Gebaeude(15, 10);
        dorfgebaeude[5] = new Gebaeude(15, 10);
        dorfgebaeude[6] = new Gebaeude(200, 136);
    }
    
    public int besucher()
    {
        int summe = 0;
        
        for(int i=0;i < dorfgebaeude.length;i++)
        {
            summe = summe + dorfgebaeude[i].anzahlBesucher();
        }
        
        return summe;
    }
}
