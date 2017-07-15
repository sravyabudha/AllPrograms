package Programs;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) 
	{
		
		int i,j, factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		i=sc.nextInt();
		for(j=1;j<=i;j++)
		{
			factorial=factorial*j;
		}
		System.out.println("Factorial of "+i+" is "+factorial);
	}

}
