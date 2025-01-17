
/**
 * Beschreiben Sie hier die Klasse Dorf.
 * Vorteile Vererbung: Mehrere verschiedene Objekte in einem Array
 * Vorteile Objektorientierung: übersichtlicher durch Vererbung
 * 
 * @author Janis
 * @version 1.0
 */
public class Dorf
{
    Gebaeude dorfgebaeude[] = new Gebaeude[7];
    
    public Dorf()
    {
        dorfgebaeude[0] = new Einfamilienhaus(3,5, 5, "Janis","Einfamilienhaus");
        dorfgebaeude[1] = new Einfamilienhaus(5,2, 10, "Timon","Einfamilienhaus");
        dorfgebaeude[2] = new Einfamilienhaus(4,1, 13, "Janis","Einfamilienhaus");
        dorfgebaeude[3] = new Einfamilienhaus(2.5,4, 4, "Marco","Einfamilienhaus");
        dorfgebaeude[4] = new Einfamilienhaus(5,3, 10, "Timothy","Einfamilienhaus");
        dorfgebaeude[5] = new Einfamilienhaus(4.5, 2, 10, "Gzuz","Einfamilienhaus");
        dorfgebaeude[6] = new Kathedrale(216, 136);
    }
    
    public void ersteVeränderung()
    {
        gebaeudeHinzufuegen(new Einfamilienhaus(2, 1, 6, "Joe","Einfamilienhaus"));
        gebaeudeHinzufuegen(new Dom(163, 500));
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
    
    public void gebaeudeHinzufuegen(Gebaeude pGebaeude)
    {
        Gebaeude[] dorfgebaeudeNeu = new Gebaeude[dorfgebaeude.length+1];
        for(int i = 0; i<dorfgebaeude.length; i++)
        {
            dorfgebaeudeNeu[i]=dorfgebaeude[i];
        }
        dorfgebaeudeNeu[dorfgebaeudeNeu.length-1]=pGebaeude;
        dorfgebaeude = dorfgebaeudeNeu;
    }
    
    public void zweiteVeränderung()
    {
        gebaeudeHinzufuegen(new Hochhaus(3, 17, 10, "Jorge","Hochhaus"));
        gebaeudeHinzufuegen(new Hochhaus(2, 12, 9, "Sinaj","Hochhaus"));
        gebaeudeHinzufuegen(new Kathedrale(279, 124));
    }
     
    public void gebauedeArtAnzeigen()  //Art von den Gebaeuden aus dem Array anzeigen
    {
        for(int i=0;i < dorfgebaeude.length;i++)
        {
            System.out.println(dorfgebaeude[i].getGebaeudeArt());
        }
    }
    
    
}
