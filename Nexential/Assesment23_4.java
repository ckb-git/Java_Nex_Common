package Nexential;
import java.util.Scanner;
class Grades
{
	double avg=0;
	int sum=0,i;
	double Average(int a[])
	{
		for(i=0;i<a.length;i++)
		{
				sum=sum+a[i];
		}
		avg=sum/a.length;
		return avg;
	}
}
public class Assesment23_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter no of Elements in array with in 20");
		int n= sc.nextInt();
		System.out.println("Enter grades in array");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==-1)
				break;
		}
		Grades G1=new Grades();
		G1.Average(a);
		System.out.println("avg of grades"+G1.avg);

	}

}
//Write a Java application that allows the user to enter up to 20 integer grades 
//into an array. Stop the loop by typing in ‐1. Your main method should call an Average 
//method that returns the average of the grades. Use the DecimalFormat as return type 
//of the method class to format the average to 2 decimal places.
//Hint:
//	double d = 2.456534;
//System.out.printf("Double upto 2 decimal places: %.2f", d);
//	Pass an Array to a Function :
//Function call : function_name(array_name);
//Function definition : re