
package ec.edu.espe.arreglos.deber;

public class Empleados {
    private String name;
    private float pay;
    private int code;
    //Getters
    public String getName() {
        return name;
    }

    public float getPay() {
        return pay;
    }

    public int getCode() {
        return code;
    } 
    //Builder

    public Empleados(String name, float pay, int code) {
        this.name = name;
        this.pay = pay;
        this.code = code;
    }

    
    
    
}
