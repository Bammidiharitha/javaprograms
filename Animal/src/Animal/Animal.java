package Animal;
public class Animal {
	public void methodofAnimal() {
		System.out.println("Animal's method()");
		}}
	   class child extends Animal{
		public void methodofAnimal() {
			System.out.println("child's method");
		}}
	class methodOverriding{
		public static void main(String[]args) {
			Animal obj1=new Animal();
			obj1.methodofAnimal();
			Animal obj2 = new child();
			obj2.methodofAnimal();
		}
	}
			

	
