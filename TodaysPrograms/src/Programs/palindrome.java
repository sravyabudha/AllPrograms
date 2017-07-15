package Programs;
import java.util.Scanner;
public class palindrome 
{
	public static void main(String args[])
	{
		int a, temp, sum=0, r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		temp=a;
		while(a>0)
		{
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		if(sum==temp)
		{
			System.out.println("The given number is a palindrome");
		}
		else
		{
			System.out.println("The given number is not palindrome");
		}
	}
}
