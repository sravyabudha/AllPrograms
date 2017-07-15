package Programs;
import java.util.Scanner;
public class primeNumbers 
{
	public static void main(String args[])
	{
		int a, i, sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter range");
		a=s.nextInt();
		for(i=2;i<a;i++)
		{
			int fl=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					fl=1;
			}
			if(fl==0)
			{
				sum=sum+i;
				System.out.println(i+" ");
			}
		}
		System.out.println("sum of prime number= "+sum);
	}
}
