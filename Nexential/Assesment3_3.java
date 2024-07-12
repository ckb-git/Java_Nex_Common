package Nexential;

import java.util.Scanner;

class Invoice
{
	String number;
	String discription;
	int Quntitypurchage;
	double itemprice;
	double Invoiceamt;
	Invoice(String a,String b,int c,double d)
	{
		number=a;
		discription=b;
		Quntitypurchage=c;
		itemprice=d;
		
	}
	void getInvoice()
	{
		Invoiceamt=Quntitypurchage*itemprice;
		System.out.println(" amount :"+Invoiceamt);
		if(Invoiceamt>0)
		{
			System.out.println(" it should be to 0");
		}
		else
		{
			System.out.println(" it should be to 0.0");
		}
	}
}

public class Assesment3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter part number");
		String number=sc.next(); 
		System.out.println("Enter part Discription");
		String discription=sc.next(); 
		System.out.println("Enter part Quntitypurchage");
		int Quntitypurchage=sc.nextInt(); 
		System.out.println("Enter part itemprice");
		double itemprice=sc.nextDouble();
		Invoice I1=new Invoice(number,discription,Quntitypurchage,itemprice);
		I1.getInvoice();
		

	}

}
//Create a class called Invoice that a hardware store might use to represent 
//an invoice for an item sold at the store. An Invoice should include four pieces 
//of information as instance variables‐
//part number(type String),
//part description(type String),
//quantity of the item being purchased (type int) and  
//price per item  (double). 
//Your class should have a constructor that initializes the four instance variables.
//Provide a method named getInvoice Amount that calculates the invoice amount 
//(i.e., multiplies the quantity by the price per item), then returns the amount 
//as a double value. 
//If the quantity is not positive, it should be set to 0. 
//If the price per item is not positive, it should be set to 0.0. 
//Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities