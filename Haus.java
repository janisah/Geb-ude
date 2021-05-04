
public class Haus extends Gebaeude
{
    protected int stockwerke;
 
    Eigentuemer eigentuemer;
    
    protected String gebaeudeArt = "Haus";

    public Haus( double pHoeheProStockwerk, int pStockwerke, int pBesucher)
    {
        super(pHoeheProStockwerk, pBesucher);
        stockwerke = pStockwerke;
        eigentuemer = new Eigentuemer();
    }
    
    public double getHoehe() {
        return hoehe * stockwerke;
    }
    
    public void eigentuemer()
    {
         eigentuemer.getEigentuemer();
    }
}
