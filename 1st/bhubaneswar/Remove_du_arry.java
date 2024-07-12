package bhubaneswar;

//Java Program to Remove Duplicate Elements
//From the Array by maintaining frequency array

import java.util.*;

class Remove_du_arry {
	public static void main(String[] args)
	{
		int a[] = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };
		int n = a.length;

		// m will have the maximum element in the array.
		int m = 0;

		for (int i = 0; i < n; i++) {
			m = Math.max(m, a[i]);
		}

		// creating the frequency array
		int[] f = new int[m + 1];

		// incrementing the value at a[i]th index
		// in the frequency array
		for (int i = 0; i < n; i++)
		{
			f[a[i]]++;
		}

		for (int i = 0; i < m + 1; i++)
		{

			// if the frequency of the particular element
			// is greater than 0, then print it once
			if (f[i] > 0) {
				System.out.print(i + " ");
			}
		}
	}
}
