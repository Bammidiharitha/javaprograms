package operator;

import java.util.Scanner;

public class operator {
	public static void main(String[]args) {
		int num;
	    Scanner sc=new Scanner (System.in);
		System.out.println("enter the number:");
		int number =sc.nextInt();
	     System.out.println("the number of one's in: "+number+"("+Integer.toBinaryString(number)+")");
	      int result=countOne(number);
	     System.out.println("is: "+result);
	     sc.close();
	}
	static int countOne(int n) {
		int count=0;
		while(n>0) {
			n=n&(n-1);
			count++;
		}
		return count;
					
		}
	     		
	     
		}

