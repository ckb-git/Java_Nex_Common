//Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user. Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.

package Nexential;

import java.util.*;

public class Assesment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no of elements in array");
		int n=sc.nextInt(),i;
		System.out.println("Enter elements");
		int a[]=new int[n];
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);   
		System.out.println("Elements of array sorted in ascending order: ");
		for(i=0;i<n;i++)
		{
		  System.out.println(a[i]);
		}
		int max=(a[n-1]-a[n-2]);
		System.out.println("pair of max diff "+max);
		int min=a[0];
		for(i=0;i<n-1;i++)
		{
		  
		  min=(a[i+1]-a[i]);
		  break;
		}
		
		System.out.println("pair of min diff "+min);

	}

}
