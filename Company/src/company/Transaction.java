
package company;

public class Transaction {
    private double saleprice;
    private int numberactions;
    private double purchaseprice;
    //Getters Setters
    public double getSaleprice() {
        return saleprice;
    }

    public int getNumberactions() {
        return numberactions;
    }

    public double getPurchaseprice() {
        return purchaseprice;
    }

    public void setSaleprice(double saleprice) {
        this.saleprice = saleprice;
    }

    public void setNumberactions(int numberactions) {
        this.numberactions = numberactions;
    }

    public void setPurchaseprice(double purchaseprice) {
        this.purchaseprice = purchaseprice;
    }
    
    //Builder
     public Transaction(double saleprice, int numberactions, double purchaseprice) {
        this.saleprice = saleprice;
        this.numberactions = numberactions;
        this.purchaseprice = purchaseprice;
    }
    //methods
    public double purchase(){
        double p;
        p=purchaseprice*numberactions;
        return p;
    }
     public double sale(){
        double s;
        s=saleprice*numberactions;
        return s;
    }   
}  
