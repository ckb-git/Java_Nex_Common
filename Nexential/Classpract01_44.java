package Nexential;

class Areas
{
	void AreaofRect(int l,int b)
	{
		int Area=l*b;
		System.out.println("Area of Reactangle :"+Area);
	}
	void AreaofSquare(int a)
	{
		int area=a*a;
		System.out.println("Area of Square :"+area);
	}
}

public class Classpract01_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Areas A1=new Areas();
		A1.AreaofRect(4, 5);
		A1.AreaofSquare(2);

	}

}
//Create
//a class to print the area of a square and a rectangle. The class has two
//methods with the same name but different number of parameters. The method for
//printing area of rectangle has two parameters which are length and breadth respectively
//while the other method for printing area of square has one parameter which is
//side of square.