package bhubaneswar;

import java.util.Arrays;
import java.util.*;
public class Sort_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		int[] ar= {2,6,9,1,4,5,7,3};
		Arrays.sort(ar);
//		for (int i:ar)
//			System.out.print(i+" ");
		System.out.println(Arrays.toString(ar));
		
		//2
		//reverse order
		Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
		Arrays.sort(arr, Collections.reverseOrder());   
		System.out.println("Array elements in descending order: " +Arrays.toString(arr)); 
		
		//3
		int a[]= {5,9,3,1,7,6,8,2};
		for (int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				int temp=0;
				
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}

	}

}
