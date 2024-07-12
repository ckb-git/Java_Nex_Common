package bhubaneswar;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class Max_Min_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		Integer[] arr= {10,90,30,20,60,05,80,70};
		int max= Collections.max(Arrays.asList(arr));
		System.out.println(max);
		int min= Collections.min(Arrays.asList(arr));
		System.out.println(min);

		//2
		int[] arr1= {10,90,30,20,60,05,80,70};
		int max1 = Arrays.stream(arr1).max().getAsInt();
		System.out.println("Largest in given array is " +max1);
		
		//3
		int arr2[] = {10, 324, 45, 90, 9808};
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr2.length;i++)
        {
            list.add(arr2[i]);
        }
        System.out.println("Largest in given array is " +Collections.max(list));
        
        //4
        int arr3[]={12,45,67,89,100,23,3456,897,452,444,899,700};
        Arrays.sort(arr3);
        System.out.println("Largest number from given array: "+arr3[arr3.length-1]);
        
        
        //5
        int[] arr4= {05, 324, 45, 90};
        int max2=arr4[0];
        for(int i=1; i< arr4.length;i++)
        {
        	if (arr4[i]>max2)
        		max2=arr4[i];
        }
        
        System.out.println(max2);

	}

}
