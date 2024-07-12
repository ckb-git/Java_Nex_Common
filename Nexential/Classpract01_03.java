package Nexential;

class Namechar
{
	int num;
	char ch;
	void Sequence(int n,char c)
	{
		num=n;
		ch=c;
		System.out.println(" integer :"+n);
		System.out.println(" charector :"+c);
	}
	void Sequence(char c,int n)
	{
		System.out.println(" charector :"+c);
		System.out.println(" integer :"+n);
	}
}

public class Classpract01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Namechar N1=new Namechar();
		N1.Sequence(2, 's');
		N1.Sequence('b', 3);

	}

}
//Create
//a class to print an integer and a character with two methods having the same
//name but different sequence of the integer and the character parameters. For
//example, if the parameters of the first method are of the form (int n, char c),
//then that of the second method will be of the form (char c, int n).