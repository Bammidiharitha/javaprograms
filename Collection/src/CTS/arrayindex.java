package CTS;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayindex {
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("alex", "brian", "charles", "dough"));
         
        String firstName = list.get(2);         
        String secondName = list.get(1);        
         
        System.out.println(firstName);
        System.out.println(secondName);
    }
}



