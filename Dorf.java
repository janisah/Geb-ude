
/**
 * Beschreiben Sie hier die Klasse Dorf.
 * 
 * @author Leon
 * @version 1.0
 */
public class Dorf
{
    Gebaeude dorfgebaeude[] = new Gebaeude[7];
    
    public Dorf()
    {
        dorfgebaeude[0] = new Einfamilienhaus(3,5, 5);
        dorfgebaeude[1] = new Einfamilienhaus(5,2, 10);
        dorfgebaeude[2] = new Einfamilienhaus(4,1, 13);
        dorfgebaeude[3] = new Einfamilienhaus(2.5,4, 4);
        dorfgebaeude[4] = new Einfamilienhaus(5,3, 10);
        dorfgebaeude[5] = new Einfamilienhaus(4.5, 2, 10);
        dorfgebaeude[6] = new Kathedrale(216, 136);
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
