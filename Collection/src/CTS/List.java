package CTS;
import java.util.ArrayList;

public class List {
	
	public static void main(String[] args)  {
		ArrayList list1=new ArrayList();
		list1.add("Haritha");
		list1.add("Sirisha");
		list1.add("Manisha");
		list1.add("Kezia");
		
		ArrayList list2=new ArrayList();
		list2.add("Mouli");
		list1.addAll(list2);
		System.out.println(list1);
		
	}
}
