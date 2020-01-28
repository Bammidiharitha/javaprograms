package ForEach;

public class ForEach 
{
	public static void main(String[] args)
{
int[] num= {1,2,3,4,5,6,7,8,9};
int sum =0;
for(int i:num)
	sum+=i;
System.out.println("sum:" +sum);
}
}