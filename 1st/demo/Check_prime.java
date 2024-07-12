package demo;

import java.util.*;
public class Check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a no ");
		int a= sc.nextInt();
		boolean f= false;
		for (int i=2;i<a/2;i++)
		{
			if (a%i==0)
			{
				f=true;
				break;
			}
		}
		if (f) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
		

	}

}
