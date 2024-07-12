package bhubaneswar;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c;
		int last=55;
		for (int i=0;i<=last;i++) {
			System.out.print(a+" ");
			if (a>=last) {
				break;
			}
			
			c=a+b;
			a=b;
			b=c;
			
		}

	}

}
