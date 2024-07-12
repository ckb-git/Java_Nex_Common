package Nexential;

class Triangle_1
{
	int side1;
	int side2;
	int side3;
	int side4;
	int side5;
	Triangle_1(int a,int b)
	{
		side1=a;
		side2=b;
		int area=(a*b)/2;
		System.out.println("Area of triangle :"+area);
	}
	Triangle_1(int c,int d,int e)
	{
		side3=c;
		side4=d;
		side5=e;
		int perimeter=c*d*e;
		System.out.println("Perimeter  of Triangle :"+perimeter);
	}
}

public class Classpract01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle_1 T1=new Triangle_1(2,3);
		Triangle_1 T2=new Triangle_1(3,4,5);
		

	}

}
//Write
//a program to print the area and perimeter of a triangle having 2 and 3 sides. 3 sides would be 3, 4
//and 5 units by creating a class named 'Triangle' with constructor having the
//three and two sides as its parameters.