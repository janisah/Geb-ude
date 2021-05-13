
public class Hochhaus extends Haus
{
    protected int stockwerke;
    public String pGebaeudeArt = "Hochhaus";
    
    
    public Hochhaus( double pHoeheProStockwerk, int pStockwerke, int pBesucherProStockwerk, String pEigentuemer,String pGebaeudeArt)
    {
        
        super(pHoeheProStockwerk, pStockwerke, pBesucherProStockwerk, pEigentuemer, pGebaeudeArt);
        
    }
    
    public int anzahlBesucher() {
        return stockwerke * besucher;
    }
    
    public String getGebaeudeArt()
    {
        return gebaeudeArt;
    }
}
