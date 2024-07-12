package Common_Programming;

public class Numerical_digits_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java12345codepoint";
		int count = 0;
		int sum=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				count++;
			}
		}
		System.out.println("number of Digits = " + count);

		//2
		int digits = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				digits++;
			}

		}
		System.out.println("Total number of Digits = "+ digits);

		
		//3
		 for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	 
	            if (Character.isDigit(ch)) {
	 
	                int di = Character.getNumericValue(ch);
	                sum = sum + di;
	            }
	        }
		 System.out.println(sum);
	}

}
