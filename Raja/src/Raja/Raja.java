package Raja;

public class Raja {
	public void methodofparent() {
	System.out.println("parent's method()");
	}}
   class child extends Raja{
	public void methodofparent() {
		System.out.println("child's method");
	}}
class methodOverriding{
	public static void main(String[]args) {
		Raja obj1=new Raja();
		obj1.methodofparent();
		Raja obj2 = new child();
		obj2.methodofparent();
	}
}
		
	


