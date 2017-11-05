
package company;

public class InvestedMoney {
    private int q;
    private double pp;
    private double pf;
    private double sf;
    private double sp;
    private double invest;
    private double ploss;
    //Getteres Setters
    public int getQ() {
        return q;
    }

    public double getPp() {
        return pp;
    }

    public double getPf() {
        return pf;
    }

    public double getSf() {
        return sf;
    }

    public double getSp() {
        return sp;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public void setPp(double pp) {
        this.pp = pp;
    }

    public void setPf(double pf) {
        this.pf = pf;
    }

    public void setSf(double sf) {
        this.sf = sf;
    }

    public void setSp(double sp) {
        this.sp = sp;
    }
    
    
    //Builder
    public InvestedMoney(int q, double pp, double pf, double sf, double sp) {
        this.q = q;
        this.pp = pp;
        this.pf = pf;
        this.sf = sf;
        this.sp = sp;
    }
    //methods
    public double investment(int q ,double pp, double pf, double sf){
        invest=(q*pp)+pf+sf;
        return invest;
    }
    public double profitLoss(int q, double sp, double inv){
        ploss=(q*sp)-invest;
        return ploss;
    }
    public void printInvestment(){
        System.out.println("\n-----INVESTMENT MONEY-----\n"
                + "Quantity "+q
                + "\nPurchase price "+pp
                + "\nPurchase rate "+pf
                + "\nSale price "+sp
                + "\nSale rate "+sf
                + "\nINV "+invest
                + "\nPL "+ploss); 
    }
}
    