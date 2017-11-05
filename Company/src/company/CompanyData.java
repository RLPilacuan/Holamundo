
package company;

public class CompanyData {
    private String name;
    private int id;
    //getters setters
    public String getName() {
        return name;
    }
     public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //Constructor

    public CompanyData(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    
}
