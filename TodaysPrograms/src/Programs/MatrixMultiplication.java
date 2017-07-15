package Programs;
import java.util.Scanner;

public class MatrixMultiplication 
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		n=sc.nextInt();
		int[][]a=new int[n][n];
		int[][]b=new int[n][n];
		int[][]c=new int[n][n];
		System.out.println("Enter the values of the first matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the values of the second matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Multiplication of the two matrices: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{	
				System.out.println(c[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}