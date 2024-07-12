package Nexential;

import java.util.Scanner;

public class Assign6_1 {

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
		System.out.println("Enter a  Specific value");
		int found=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(found==arr[i])
			{
				System.out.println(" Array contains the given value");
				
			}
			else
			{
				System.out.println(" Array not contains the given value");
				break;
			}
		}
		

	}

}
