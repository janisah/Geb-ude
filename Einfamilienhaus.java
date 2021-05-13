
public class Einfamilienhaus extends Haus
{
     String gebaeudeArt = "Einfamilienhaus";
    
    public Einfamilienhaus( double pHoeheProStockwerk, int pStockwerke, int pBesucher, String pEigentuemer, String pGebaeudeArt)
    {
        super(pHoeheProStockwerk, pStockwerke, pBesucher, pEigentuemer,pGebaeudeArt);
    }
    
    public String getGebaeudeArt()
    {
        return gebaeudeArt;
    }
}
