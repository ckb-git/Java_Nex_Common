package Nexential;

import java.util.Scanner;

class Studentname
{
	String name;
	String name2;
	Studentname(String s)
	{
		name=s;
	}
	Studentname()
	{
		name2="unknown";
	}
}

public class Classpract01_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the String");
//		String s=sc.nextLine();
		
		Studentname S1=new Studentname();
		S1.name="jagadish";
		System.out.println(S1.name);
		System.out.println(S1.name2);

	}

}
//Write
//a program to print the names of students by creating a Student class. If no
//name is passed while creating an object of Student class, then the name should
//be "Unknown", otherwise the name should be equal to the String value
//passed while creating object of Student class.