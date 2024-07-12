package demo;

public class PrimeNo_print {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int min=1;
		int max=10;
		for (int i=min;i<=max;i++)
		{
			if (isprime(i)) {
				System.out.println(i);
			}
		}

	}
	public static boolean isprime(int n) 
	{

		if (n <= 1) {  
			return false;  
		}  
		for (int i = 2; i <= n/2; i++) {  
			if (n % i == 0) {  
				return false;  
			}  
		}  
		return true;  
	}
}
