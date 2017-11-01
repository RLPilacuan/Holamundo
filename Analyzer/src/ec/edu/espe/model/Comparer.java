
package ec.edu.espe.model;


public class Comparer {
    
    public static void main(String[] args) {
        Analyst analist1=new Analyst("Roger","uno",new History());
        
        System.out.println("El nombre es: "+analist1.getName()
                +"Inicializacion "+analist1.getInitials());
        
    }
}
