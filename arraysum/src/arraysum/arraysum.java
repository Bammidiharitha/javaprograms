package arraysum;

import java.util.Scanner;

public class arraysum {
	public static void main(String[]args) {
		int n=0,sum=0;
		float average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements you want in array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all the elements:");
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		sum+=a[i];
		
		}
		System.out.println("sum:" +sum);
		average=sum/n;
		System.out.println("average:" +average);
		
				
				
	}
	

}
