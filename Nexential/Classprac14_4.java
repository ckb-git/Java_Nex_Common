package Nexential;

import java.util.Scanner;

public class Classprac14_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of elements in array");
		int n=sc.nextInt();
		System.out.println("enter Elements");
		int a[]=new int[n];
		int i,j;
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j]){
				
				a[j]=0;
				}
			}
		}
		System.out.println(" After deleting duplicate element");
		for(i=0;i<n;i++)
		{
			if(a[i]!=0) {
				System.out.println(a[i]);
			}
		}


	}

}
