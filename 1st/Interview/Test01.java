package Interview;


public class Test01 {
	static int sumall(int n) {
		int sum=0;
		int rem=0;
		while(n!=0) {
			rem= n%10;
			sum= sum+rem;
			n=n/10;
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,45,667,51,57,101,34,56,456,344};
		
		for(int num:arr)
		{
			if (sumall(num)%2!=0)
				System.out.print(num+" ");
		}
		
		
		}
		
		}


	

