package Nexential;


import java.util.Random;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Random r= new Random();
		int number=r.nextInt(10)+1;
		System.out.println(number);
		Scanner sc= new Scanner(System.in);
		
		for(int i=1;i<=3;i++) {
			System.out.println("Enter a number 0 to 9");
		    int n=sc.nextInt();
		if(n==number)
		{
			System.out.println("your guess is  correct");
			break;
		}
		else
		{
			System.out.println("your guess is not correct");	
		}
		}
		

	}

}
