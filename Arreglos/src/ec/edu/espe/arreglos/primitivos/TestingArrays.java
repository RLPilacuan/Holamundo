package ec.edu.espe.arreglos.primitivos;

public class TestingArrays {
    public static void main(String[] args) {
        int[] A = new int[10];
        int [] otrosEnteros= {8,11,2017};
        float B[] = new float[5];
        float decimal1 = 0.1f,decimal2=1.0f;
        
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        for (int i = 0; i < B.length; i++) {
           
            B[i] = (decimal2 + decimal1);
            decimal1=decimal1+0.1f;
        }
        /*for(int i=0;i<B.length;i++){
            System.out.print(" "+B[i]);
        }*/
        
        for(float n:B){
            System.out.println("Elemento: "+n);
        }
        System.out.println("\n");
        for(int i:otrosEnteros){
            System.out.print(" "+i+" ");   
        }
        
   }
}
