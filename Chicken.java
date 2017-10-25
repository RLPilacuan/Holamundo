public class Chicken
{
		//Atributos
		private String name;
		private String color;
		private int age;
		
		//Metodos
		public void layAnEgg()
		{
		System.out.println("The chicken lay an egg");
		}
		public void poop()
		{
		System.out.println("The chicken poop");
		}
		public void drink()
		{
		System.out.println("The chicken drank");
		}
		public void initializeData(String name,String color,int age)
		{
			this.name=name;
			this.color=color;
			this.age=age;
		}		
		public void print()
		{
			System.out.println("The name of the chicken is"+name+"Color is: "+color+" The age is: "+age);
		}
		
}