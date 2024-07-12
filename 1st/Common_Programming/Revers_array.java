package Common_Programming;

import java.util.*;
public class Revers_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6};
		int len=a.length;
		int[] b= new int[len];
		
		//1
		for(int i=len-1; i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		//2
		for(int i=0;i<len;i++) {
			b[i]=a[len-1-i];
		}
		for(int j:b) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		//3
		Integer [] arr = {10, 20, 30, 40, 50};
		Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
        
        //4
        List<Integer>  mylist = new ArrayList<Integer>();  
        
        for(int j:arr) {
        	mylist.add(j);
        }
        
        Collections.reverse(mylist);
        System.out.println(mylist);
		
		
	}

}
