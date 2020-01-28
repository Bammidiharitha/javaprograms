package Trainer;
public class Testing {
	public static void main(String[]args) {
			Trainer Test1 = new Trainer();
			
			Test1.name = "rajasekhar";
			((Object) Test1).designation();
			
		 Trainer Test2 = new Trainer();

	        Test2.name();
			Test2.designation();
			Test2.college();
			Test2.subject();
		}
}


