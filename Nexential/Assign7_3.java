package Nexential;

import java.util.*;

public class Assign7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of elements in array :");
		int x=sc.nextInt();
		System.out.println("Enter elements");
		int arr[]=new int[x];
		for(int k=0;k<x;k++)
		{
			arr[k]=sc.nextInt();
		}
		System.out.println(" Even numbers are");
		for(int k=0;k<x;k++)
		{
			if(arr[k]%2==0)
			{
				System.out.println(arr[k]);
			}
		}
		System.out.println(" odd numbers are");
		for(int k=0;k<x;k++)
		{
			if(arr[k]%2!=0)
				System.out.println(arr[k]);
		}

	}

}
