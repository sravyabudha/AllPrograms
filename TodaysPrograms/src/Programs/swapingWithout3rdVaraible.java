package Programs;
import java.util.Scanner;

public class swapingWithout3rdVaraible 
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a= "+a+"b="+b);
	}
}
