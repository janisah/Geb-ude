
public class Haus extends Gebaeude
{
    protected int stockwerke;
    Einfamilienhaus einfamilienhaus;
    Hochhaus hochhaus;
    Eigentuemer eigentuemer;
    String sEigentuemer;
    protected String gebaeudeArt;

    public Haus( double pHoeheProStockwerk, int pStockwerke, int pBesucher, String pEigentuemer, String pGebaeudeArt)
    {
        super(pHoeheProStockwerk, pBesucher);
        stockwerke = pStockwerke;
         sEigentuemer = pEigentuemer;
        eigentuemer = new Eigentuemer();
        eigentuemer.setName(pEigentuemer);
        gebaeudeArt = pGebaeudeArt;
    }
    
    public double getHoehe() {
        return hoehe * stockwerke;
    }
    
    public void geteEigentuemer()
    {
         eigentuemer.getEigentuemer();
    }
    
     public void setEigentuemer()
    {
         eigentuemer.setName(sEigentuemer);
    }
    
  
}
