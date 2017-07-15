package Programs;
import java.util.*;
public class fabSeries 
{
	public static void main(String args[])
	{
	int n1=0, n2=1, n3, i;
	System.out.print("Enter count");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.print(n1+" "+n2);
	for (i=2;i<a;++i)
	{
		n3=n1+n2;
		System.out.print(" "+ n3);
		n1=n2;
		n2=n3;
	}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
