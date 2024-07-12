package Nexential;

import java.util.Scanner;

public class Assesment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number 100 to 500");
		int n=sc.nextInt();
		int temp,num,count=0,sum=0;
		num=n;
		for( ;num!=0;num/=10)
		{
			//temp=temp/10;
			
			temp=num%10;
			//count++;
			sum=sum+temp*temp*temp;
			//temp/=10;
			
		}
		if(n==sum) {
			System.out.println("it is armsstrong number");
		}
		else
		{
			System.out.println("It is not Armstrong number");
		}

	}

}
