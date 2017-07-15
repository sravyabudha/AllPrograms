package Programs;
import java.util.Scanner;

public class swap 
{
	public static void main(String[] args)
	{
			int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first number");
			a=sc.nextInt();
			System.out.println("Enter second number");
			b=sc.nextInt();
			int c=a;
			a=b;
			b=c;
			System.out.println("After swapping a="+a+" b="+b);
	}
}
