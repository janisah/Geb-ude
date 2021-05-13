
public class Haus extends Gebaeude
{
    protected int stockwerke;
    Einfamilienhaus einfamilienhaus;
    Hochhaus hochhaus;
    Eigentuemer eigentuemer;
    String sEigentuemer;
    protected String gebaeudeArt;

    public Haus( double pHoeheProStockwerk, int pStockwerke, int pBesucher, String pEigentuemer)
    {
        super(pHoeheProStockwerk, pBesucher);
        stockwerke = pStockwerke;
         sEigentuemer = pEigentuemer;
        eigentuemer = new Eigentuemer();
        eigentuemer.setName(pEigentuemer);
        
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
