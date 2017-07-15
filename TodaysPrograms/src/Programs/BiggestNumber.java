package Programs;

import java.util.Scanner;

public class BiggestNumber 
{
	public static void main(String args[])
	{
		int a, b, ln, sn;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		ln=sn=a%10;
		while(a>0)
		{
			b=a%10;
			a=a/10;
			if(b>ln)
			{
				ln=b;
			}
			if(b<sn)
			{
				sn=b;
			}
		}
		System.out.println("Smallest Number is "+sn+" Largest Number is "+ln);
	}
}
