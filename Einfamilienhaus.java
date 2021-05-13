
public class Einfamilienhaus extends Haus
{
     String gebaeudeArt = "Einfamilienhaus";
    
    public Einfamilienhaus( double pHoeheProStockwerk, int pStockwerke, int pBesucher, String pEigentuemer)
    {
         
        super(pHoeheProStockwerk, pStockwerke, pBesucher, pEigentuemer);
        
    }
    
    public String getGebaeudeArt()
    {
        return gebaeudeArt;
    }
}
