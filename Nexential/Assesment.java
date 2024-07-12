package Nexential;

import java.util.Scanner;

public class Assesment {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter custemer number");
		int cust=sc.nextInt();
		System.out.println("Enter custemer Account number");
		int Acnum=sc.nextInt();
		
		System.out.println("Enter Gallons of water used(take millions)");
		double galonsofwater=sc.nextInt();
		System.out.println("Enter code 1 or 2 or 3");
		int code=sc.nextInt();
		
		switch(code) {
		case 1:
		
			
			double bill=5+0.005*galonsofwater;
			double total=cust*bill;
			System.out.println("Total bill: "+total);
			break;
			
		case 2:
			
				double bill2=1000+0.0025*(galonsofwater-4);
				double total2=cust*bill2;
				System.out.println("Total bill : "+total2);
				break;
			
		case 3:
			
			if(galonsofwater<=4) {
				
				System.out.println("toal bill : "+(1000*galonsofwater));
			}
			else if(galonsofwater<=10) {
				
				System.out.println("toal bill : "+(2000*galonsofwater));
			}
			else {
				
				System.out.println("toal bill : "+(3000*galonsofwater));
			}
		break;

	}

}
}
