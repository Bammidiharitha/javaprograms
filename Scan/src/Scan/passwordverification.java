package Scan;
import java.util.Scanner;
public class passwordverification {
          public static void main(String[] args)   {
        	  Scanner sc=new Scanner(System.in);
        	  boolean valid=false;
        	  String password;
        	  System.out.println("please enter password and then hit enter:");
        	  password=sc.nextLine();
        	  if(password.length()<8)
        	  {
        		  valid=false;
        		  System.out.println("password must have atleast 8 characters");
        		  
        	  
        	  for(int i=0;i<password.length();i++)   {
        		  char c=password.charAt(i);
        		  if(('a'<=c && c<='z')||('A'<=c && c<='Z')||('0'<=c && c<='9'))   {
        			  valid=true;
        			  
        		  }
        		  else  
        		  {
        			  System.out.println("only letter&digits are acceptable.");
        			  valid=false;
        			  break;
        		  }
        		  System.out.println("password accepted");
        	  }
        		  System.out.println("password is not accepted");
        	  }
        	  }
          }

