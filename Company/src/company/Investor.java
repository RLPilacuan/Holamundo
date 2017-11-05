
package company;

public class Investor {
   private double purchaseprice;
   private int qsale;
   private int qpurchase;
   private double saleprice;
   private int q;
   //Getters Setters

    public double getPurchaseprice() {
        return purchaseprice;
    }

    public int getQsale() {
        return qsale;
    }

    public int getQpurchase() {
        return qpurchase;
    }

    public double getSaleprice() {
        return saleprice;
    }

    public int getQ() {
        return q;
    }

    public void setPurchaseprice(double purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public void setQsale(int qsale) {
        this.qsale = qsale;
    }

    public void setQpurchase(int qpurchase) {
        this.qpurchase = qpurchase;
    }

    public void setSaleprice(double saleprice) {
        this.saleprice = saleprice;
    }

    public void setQ(int q) {
        this.q = q;
    }
   //Builder

    public Investor(double purchaseprice, int qsale, int qpurchase, double saleprice, int q) {
        this.purchaseprice = purchaseprice;
        this.qsale = qsale;
        this.qpurchase = qpurchase;
        this.saleprice = saleprice;
        this.q = q;
    }
    //methods
    public double buyActions(int qpurchase,double purchaseprice){
      double buyactions;
      buyactions=qpurchase*purchaseprice;
      return buyactions;
    }
    
    public double sellShares(int qsale, double saleprice){
      double sellshares;
      sellshares=qsale*saleprice;
      return sellshares;
    }
    
    public double gain(double purchaseprice, double saleprice){
        double win;
            win =saleprice-purchaseprice;
        return win;
    }
    public double lost(double purchaseprice, double saleprice){
        double loser;
        loser=saleprice-purchaseprice;
        return loser;
    }

   
}
