package bhubaneswar;

public class Num_palidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1221;
		int original= num;
		int r=0, rem;
		while(num !=0) {
			rem=num%10;
			r=r*10+rem;
			num /=10;
		}
		if(r==original) {
			System.out.println("palindrom "+original);
		}
		else {
			System.out.println("not palidrom " +original);
		}

	}

}
