
public class Haus extends Gebaeude
{
    protected int stockwerke;
 
    Eigentuemer eigentuemer;
    
    protected String gebaeudeArt = "Haus";

    public Haus( double pHoeheProStockwerk, int pStockwerke, int pBesucher, String pEigentuemer)
    {
        super(pHoeheProStockwerk, pBesucher);
        stockwerke = pStockwerke;
        eigentuemer = new Eigentuemer();
        eigentuemer.setName(pEigentuemer);
    }
    
    public double getHoehe() {
        return hoehe * stockwerke;
    }
    
    public void eigentuemer()
    {
         eigentuemer.getEigentuemer();
    }
    
    
}
