package Nexential;

import java.util.Scanner;

public class Assesment1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter income");
		double IT=sc.nextDouble(),tax;
		if(IT<=50000)
		{
			tax=0;
		}
		else if(IT<60000)
		{
			tax=0.1*IT;
		}
		else if(IT<150000)
		{
			tax=0.2*IT;
		}
		else {
			tax=0.3*IT;
		}
		System.out.println(" Income Tax ="+tax);

	}

}
