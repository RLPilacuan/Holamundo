
package ec.edu.espe.arreglos.tipos;
import ec.edu.espe.arreglos.modelo.Animal;
public class TestingAnimals {
    public static void main(String[] args) {
        Animal Caballos[]=new Animal[10];
        int i,id;
        String name,eyes;
        for(i=0;i<Caballos.length;i++){
            if((i%2)==0){
            name="Vicente";
            id=i+1;
            eyes="Brown";
            }
            else{
            name="Vicente";
            id=i+1;
            eyes="Black";  
            }
           Caballos[i]=new Animal(name,eyes,id); 
        }
        //Print
        System.out.println("\n-----Lista de Caballos-----\n"
                + "NAME   ID  EYES");
        for(i=0;i<Caballos.length;i++){
            System.out.println(Caballos[i].getName()+" "+Caballos[i].getId()+" "+Caballos[i].getEyes()+"\n");
            
        }
    }
    
}
