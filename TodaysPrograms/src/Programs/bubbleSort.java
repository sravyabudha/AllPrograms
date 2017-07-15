package Programs;
import java.util.Scanner;
public class bubbleSort 
{
	public static void main(String args[])
	{
		int a,b,c,swap;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of integers to sort");
		a=sc.nextInt();
		int array[]=new int[a];
		System.out.println("Enter "+ a +"  integers");
		for(b=0;b<a;b++)
			array[b]=sc.nextInt();
		for(b=0;b<(a-1);b++)
		{
			for(c=0;c<a-b-1;c++)
			{
				if(array[c]>array[c+1])
				{
					swap=array[c];
					array[c]=array[c+1];
					array[c+1]=swap;
				}
			}
		}
		System.out.println("The Sorted list is");
		for(b=0;b<a;b++)
			System.out.println(array[b]);
	}
}