package Programs;
import java.util.Scanner;

public class SecondHighestNumber 
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of an array");
		a=sc.nextInt();
		int b[]=new int [a];
		System.out.println("Enter "+a+" elements");
		for(int i=0; i<a; i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0; i<a; i++)
		{
			for(int j=i; j<a;j++)
			{
				if(b[i]>b[j])
				{
					int c=b[i];
					b[i]=b[j];
					b[j]=c;
				}
			}
		}
		System.out.println("The Second largest number is "+b[a-2]);
		
	}
}
