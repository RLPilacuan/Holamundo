
package ec.edu.espe.arreglos.tipos.deber;

import ec.edu.espe.arreglos.deber.Empleados;

public class TestingEmployees {
    public static void main(String[] args) {
        Empleados T[]=new Empleados[5];
        String name;
        int code;
        float pay;
        float decimal=374.2f;
        for(int i=0;i<T.length;i++){
            code=i+101;
            pay=decimal;
            name="EMPLEADO";
        T[i]=new Empleados(name,pay,code);
        }
        //Print
        System.out.println("\n-----LISTA DE EMPLEADOS-----\n");
        System.out.println("Name     Code  Pay");
        for(int j=0;j<T.length;j++){
            System.out.println(T[j].getName()+" "+T[j].getCode()+"   "+T[j].getPay());
        }
    }
 
}
