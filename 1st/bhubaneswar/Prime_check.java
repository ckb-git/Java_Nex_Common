package bhubaneswar;
import java.util.*;
public class Prime_check {
	public static void check(int num) {
		if (num<2) {
			System.out.println("enter valid number");
		}
		else {
			int count=0;
			for(int i=1;i<=num/2;i++) 
			{
				if(num%i==0) {
					count++;
					//System.out.println(count);
				}
			}
			if (count>1) {
				System.out.println(num+" is not a prime");
			}
			else {
				System.out.println(num+" prime number");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prime_check p= new Prime_check();
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a nuber:- ");
		int num=sc.nextInt();
		check(num);

	}

}
