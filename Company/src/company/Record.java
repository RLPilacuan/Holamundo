
package company;

public class Record {
    private int qrecord;
    private int ptrecord;
    private double pprecord;
    private double pfrecord;
    private int strecord;
    private double sprecord;
    private double sfrecord;
    private String symbol;
    //Getters Setters
    public int getQrecord() {
        return qrecord;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getPtrecord() {
        return ptrecord;
    }

    public double getPprecord() {
        return pprecord;
    }

    public double getPfrecord() {
        return pfrecord;
    }

    public int getStrecord() {
        return strecord;
    }

    public double getSprecord() {
        return sprecord;
    }

    public double getSfrecord() {
        return sfrecord;
    }

    public void setQrecord(int qrecord) {
        this.qrecord = qrecord;
    }

    public void setPtrecord(int ptrecord) {
        this.ptrecord = ptrecord;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setPprecord(double pprecord) {
        this.pprecord = pprecord;
    }

    public void setPfrecord(double pfrecord) {
        this.pfrecord = pfrecord;
    }

    public void setStrecord(int strecord) {
        this.strecord = strecord;
    }

    public void setSprecord(double sprecord) {
        this.sprecord = sprecord;
    }

    public void setSfrecord(double sfrecord) {
        this.sfrecord = sfrecord;
    }
    //Builder
    public Record(int qrecord, int ptrecord, double pprecord, double pfrecord, int strecord, double sprecord, double sfrecord, String symbol) {
        this.qrecord = qrecord;
        this.ptrecord = ptrecord;
        this.pprecord = pprecord;
        this.pfrecord = pfrecord;
        this.strecord = strecord;
        this.sprecord = sprecord;
        this.sfrecord = sfrecord;
        this.symbol = symbol;
    }
    public void showRecord(){
        System.out.println("\nSymbol "+symbol
        +"\nQuantity "+qrecord
        +"\nPurchase Date/Time "+ptrecord
        +"\nPurchase price "+pprecord
        +"\nPurchase Trans Free "+pfrecord
        +"\nSale Date Time "+strecord
        +"\nSale price "+sprecord
        +"\nSale Trans Free "+sfrecord      
        );  
   }
    
}
