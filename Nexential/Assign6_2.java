package Nexential;

import java.util.Scanner;

public class Assign6_2 {

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
		System.out.println("Enter a  array element what u want");
		int elem=sc.nextInt();
		int index=-1;
		for(int i=0;i<n;i++)
		{
			if(elem==arr[i])
			{
				index=i;
				break;
			}
		}
		System.out.println(elem+ " is located at "+index+" index position");
		

	}

}
