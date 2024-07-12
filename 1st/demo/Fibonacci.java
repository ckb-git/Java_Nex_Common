package demo;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int fist=0;
		int second=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(fist+" ");
			
			int next = fist+second;
			fist=second;
			second= next;
		}
		

	}

}

//while (i <= n) {
//    System.out.print(firstTerm + ", ");
//
//    int nextTerm = firstTerm + secondTerm;
//    firstTerm = secondTerm;
//    secondTerm = nextTerm;
//
//    i++;
