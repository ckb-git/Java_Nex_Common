package Nexential;

import java.util.Arrays;
import java.util.Scanner;

public class Assesment2_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no of elements in array");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter specific position where u want add");
		int sp=sc.nextInt();
		System.out.println("Enter specific Element where u want add");
		int se=sc.nextInt();
		int na[]=new int[n+1];
		int j=0,i;
		for(i=0;i<na.length;i++)
		{
			if(i==sp) {
				na[i]=se;
			}
			else
			{
				na[i]=a[j];
				j++;
			}
		}
		na[sp]=se;
		System.out.print("Array after adding element: "+Arrays.toString(na));

	}

}
