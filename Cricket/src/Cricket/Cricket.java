package Cricket;
public class Cricket {
        int age,centuarys,halfcentuarys;
         String name,dateofbirth;
		Cricket(){
			this.age =51;
			this.name= "dhoni";
			this.centuarys=100;
			this.halfcentuarys=75;
			this.dateofbirth="7-6-1965";
			
			}
		Cricket(String n, int t, int a, int b, String d) {
			this.age=t;
			this.name=n;
			this.centuarys=a;
			this.halfcentuarys=b;
			this.dateofbirth=d;
		
			}
			public static void main(String[]args) {
				Cricket obj1= new Cricket();
				Cricket obj2= new Cricket("dhoni",51,100,75,"7-6-1965");
				System.out.println(obj1.name+""+obj1.age+""+obj1.centuarys+""+obj1.halfcentuarys+""+obj1.dateofbirth);
				System.out.println(obj1.name+""+obj1.age+""+obj1.centuarys+""+obj1.halfcentuarys+""+obj1.dateofbirth);
					}
	}


