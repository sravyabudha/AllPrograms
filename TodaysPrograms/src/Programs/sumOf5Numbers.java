package Programs;

import java.util.Scanner;

public class sumOf5Numbers 
{
	public static void main(String args[])
	{
		int a,b,c,d,e,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println("Enter third number");
		c=sc.nextInt();
		System.out.println("Enter fourth number");
		d=sc.nextInt();
		System.out.println("Enter fifth number");
		e=sc.nextInt();
		f=a+b+c+d+e;
		System.out.println("Sum of 5 numbers= "+f );
	}
}
