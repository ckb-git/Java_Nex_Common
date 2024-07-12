package Nexential;

import java.util.Scanner;

class matrix1
{
int rows,i,j;
int columns;
matrix1(int a,int b)
{
	Scanner sc= new Scanner(System.in);
	rows=a;
	columns=b;
	int g[][]=new int [a][b];
	int d[][]=new int [a][b];
	System.out.println("Enter no of elements");
	for(i=0;i<a;i++)
	{
		for(j=0;j<b;j++)
		{
			g[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<a;i++)
	{
		for(j=0;j<b;j++)
		{
			d[i][j]=sc.nextInt();
		}
	}

	int c[][]=new int[a][b];
	for(i=0;i<a;i++)
	{
		for(j=0;j<b;j++)
		{
			c[i][j]=0;
			for(int k=0;k<a;k++)
			{
				c[i][j]+=d[i][k]*g[k][j];
			
			}
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}

public class Assesment23_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no of rows");
		int rows=sc.nextInt();
		System.out.println("Enter a no of columns");
		int columns=sc.nextInt();
		matrix1 M1=new matrix1(rows,columns);

	}

}
