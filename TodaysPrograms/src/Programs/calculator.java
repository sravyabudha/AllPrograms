package Programs;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args){
		double a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextDouble();
		System.out.println("Enter second number");
		b=sc.nextDouble();
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Division");
		System.out.println("4.Multiplication");
		System.out.println("5.Modulus");
		System.out.println("Enter your choice");
		int ch;
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Addition is " +(a+b));
			break;
		case 2:
			System.out.println("Substraction is " +(a-b));
			break;
		case 3:
			System.out.println("Division is " +(a/b));
			break;
		case 4:
			System.out.println("Multiplication is " +(a*b));
			break;
		case 5:
			System.out.println("Modulus is " +(a%b));
			break;
		default:
			System.out.println("Your choice is invalid");
			break;
		}
	}
}
