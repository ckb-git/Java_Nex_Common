package Nexential;

import java.util.Scanner;

public class Assign6_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of elements in array");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("reverse of array");
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}

	}

}
