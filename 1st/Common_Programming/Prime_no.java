package Common_Programming;
import java.util.*;
public class Prime_no {
	public static boolean check_prime(int x) {
		if (x<2) {
			return false;
		}
		int count=0;
		for (int i=1;i<=x/2;i++) {
			if (x%i==0) {
				count ++;
			}
		}
		if (count>1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int arr[]= {3,5,8,9,11,15,21,23};
		System.out.println("not prime:");
		for(int i=0;i<arr.length;i++) {
			if(check_prime(arr[i])) {
				System.out.print(arr[i]+",");
				
			}
		}
		
		//System.out.println(check_prime(4));

	}

}
