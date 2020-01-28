package CTS;
import java.util.ArrayList;

public class contain {

	    public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList<>(2);
	         
	        list.add("A");
	        list.add("B");
	        list.add("C");
	        list.add("D");
	         
	        System.out.println( list.contains("A") );      
	         
	        System.out.println( list.contains("Z") );       
	    }
	}

