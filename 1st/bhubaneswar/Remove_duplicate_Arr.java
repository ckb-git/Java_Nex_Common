package bhubaneswar;
import java.util.*;
public class Remove_duplicate_Arr {

	public static void main(String[] args) {

		//		int a[] = {5,2,6,8,6,7,5,2,8};
		//		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
		//		for (int i = 0; i < a.length; i++)
		//			set.add(a[i]);
		//
		//		System.out.print(set);

		int a[] = { 1, 1, 2, 2, 2, 3};
		int n = a.length;

		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) 
		{
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}

		temp[j++] = a[n - 1];

		for (int i = 0; i < j; i++) 
		{
			a[i] = temp[i];
			System.out.print(a[i] + " ");
		}
	}

}
