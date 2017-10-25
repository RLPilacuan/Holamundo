
public class HelloWorld{
	public static void main(String [] args)
	{
		System.out.println("Hello Roger");
		Chicken chicken;
		//Se crea un objeto
		chicken =new Chicken();
		//Llamo los metodos
		chicken.initializeData("Lucy","Brown",2);
		chicken.print();
		
	}		
}
