package Nexential;

import java.util.Scanner;
class Matrix
{
	int row; int col;
	Matrix(int r,int c,int a[][],int b[][])
	{
		row=r;
		col=c;
	}
	void multiply()
	{
		
	}
}

public class Assesment31_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and columns of matrix");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int [row][col];
		int b[][]=new int [row][col];

	}

}
//Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object.
//1 - get the number of rows
//2 - get the number of columns
//3. multiplying the two matrices