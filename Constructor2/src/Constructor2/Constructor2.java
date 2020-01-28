package Constructor2;
public class Constructor2 {
	    int age;
		String name;
		Constructor2(){
			this.age =21;
			this.name= "https://www.google.com/";
			
			}
		Constructor2(String n, int t) {
			this.age=t;
			this.name=n;
		}
			public static void main(String[]args) {
				Constructor2 obj1= new Constructor2();
				Constructor2 obj2= new Constructor2("https://www.google.com/",21);
				System.out.println(obj1.name+""+obj1.age);
				System.out.println(obj2.name+""+obj2.age);
			}
	}
	


