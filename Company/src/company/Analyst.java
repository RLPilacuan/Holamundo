
package company;

public class Analyst {
    private double money;
    private int day;
    private int purchasetime;
    private int saletime;
    private double stockinvest;
    //Getters Setters
    public double getMoney() {
        return money;
    }

    public double getStockinvest() {
        return stockinvest;
    }

    public int getDay() {
        return day;
    }

    public int getPurchasetime() {
        return purchasetime;
    }

    public int getSaletime() {
        return saletime;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setPurchasetime(int purchasetime) {
        this.purchasetime = purchasetime;
    }

    public void setStockinvest(double stockinvest) {
        this.stockinvest = stockinvest;
    }
    
    public void setSaletime(int saletime) {
        this.saletime = saletime;
    }
    //Builder
    public Analyst(double money, int day, int purchasetime, int saletime) {
        this.money = money;
        this.day = day;
        this.purchasetime = purchasetime;
        this.saletime = saletime;
    }
    //methods
    public double stockInvestment(int purchsetime,int saletime){
        stockinvest=(saletime-purchasetime)/(24*60);
        return stockinvest;
    }
    public double profitDay(int day, double purchasetime, int saletime){
       double profitday;
       profitday=money/stockinvest;
       return profitday;
    }
}
