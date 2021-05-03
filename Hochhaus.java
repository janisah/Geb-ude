
public class Hochhaus extends Haus
{
    protected int stockwerke;
    
    public Hochhaus( double pHoeheProStockwerk, int pStockwerke, int pBesucherProStockwerk, String pEigentuemer)
    {
        super(pHoeheProStockwerk, pStockwerke, pBesucherProStockwerk,pEigentuemer);
    }
    
    public int anzahlBesucher() {
        return stockwerke * besucher;
    }
    
}
