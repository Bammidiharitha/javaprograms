package CTS;

import java.util.Scanner;

public class Arrayexceptions {
        public static void main(String[] args)    {
        	
        	Scanner s = new Scanner(System.in);
        	System.out.println("Enter a number:");
        	int a;
        	
        	
        	try {
        		a=s.nextInt();
        		
        	
  
        }
        	catch(Exception e) {
        		System.out.println("Invalid Number!");
        		a=0;
        		
        	}
        	System.out.println("Value of a:" +a);
        	s.close();
        
        	
      
        
   }
}
