package Nexential;

class Geometrical
{
	void numberOfsides(int a,int b,int c)
	{
		int area=a*b*c;
		System.out.println("It is a Triangle area :"+area);
	}
	void numberOfsides(int a,int b)
	{
		int area=a*b;
		System.out.println("It is a Rectangle area :"+area);
	}
	void numberOfsides(int a)
	{
		int area=a*a;
		System.out.println("It is a Square area : "+area);
	}
}

public class Classpract01_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometrical G1=new Geometrical();
		G1.numberOfsides(3, 4, 5);
		G1.numberOfsides(6, 7);
		G1.numberOfsides(5);

	}

}
//Write a java program with method named numberOfSides( ). Use the methods
//to shows the number of sides in the geometrical structures  and find its area
//Rectangle, Triangle and square