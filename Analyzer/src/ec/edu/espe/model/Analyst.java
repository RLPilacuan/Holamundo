
package ec.edu.espe.model;
public class Analyst {
    private String name;
    private String initials;
    private History history;

    public String getName() {
        return name;
    }
     public void setName(String name) {
        this.name = name;
    }

    public String getInitials() {
        return initials;
    }
    public void setInitials(String initials) {
        this.initials = initials;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    public Analyst(String name, String initials, History history) {
        this.name = name;
        this.initials = initials;
        this.history = history;
    }
    public void mostrar()
    {
        System.out.println("the name is: "+name
        +"\nthe initial is: "+initials);
    }

    
    
}
