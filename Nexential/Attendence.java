//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.
//Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

package Nexential;

import java.util.Scanner;

public class Attendence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of classes  attended and held");
		int present=sc.nextInt();
		int Held=sc.nextInt();
		double Percentage=(Held/present)*100;
		if(Percentage>75)
		{
			System.out.println("If there is any Student get medical cause (1:yes or 2:No)");
			int choice=sc.nextInt();
			if(choice==1)
			{
			System.out.println("He can sit in the Exam");
			}
			else
			{
				System.out.println("he is not allowing to Exam");
			}
			
		}
		else
			System.out.println("he is not allowing to Exam");

	}

}
