package Programs;

import java.util.Scanner;

public class BinaryNumber 
{
	public static void main(String args[])
	{
		int a, coe=0, rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		a=sc.nextInt();
		
		while(a>0)
		{
			if((a%10==0)||(a%10==1))
			
			coe++;
			rem++;
			a=a/10;
			
		}
		if(coe==rem)
		System.out.println("Given number is a binary number");
		else
		System.out.println("Given number is not a binary number");
	}
}
