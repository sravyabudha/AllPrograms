package Programs;
import java.util.Scanner;
public class Linearsearch 
{
	public static void main(String args[])
	{
		int array[], n, a, search;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of digits");
		n=sc.nextInt();
		System.out.println("Enter "+n+" digits");
		array=new int[n];
		for (a=0;a<n;a++)
			array[a]=sc.nextInt();
		System.out.println("Enter the value to search");
		search=sc.nextInt();
		for(a=0;a<n;a++)
		{
			if(array[a]==search)
			{
				System.out.println(search+" is present at location "+(a+1)+".");
			}
		}
		if(a!=n)
		System.out.println(search+" is not present in the array");
	}
}
