package Constructor;

public class Constructor {
        int age;
		String name;
		Constructor(){
			this.age =21;
			this.name= "rajasekhar";
			
			}
		Constructor(String n, int t) {
			this.age=t;
			this.name=n;
		}
			public static void main(String[]args) {
				Constructor obj1= new Constructor();
				Constructor obj2= new Constructor("rajasekhar",21);
				System.out.println(obj1.name+""+obj1.age);
				System.out.println(obj2.name+""+obj2.age);
			}
	}
	
				
				
			
		
		
	
