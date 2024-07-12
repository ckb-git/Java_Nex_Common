package Common_Programming;

public class Palindrome_string {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Radar";
		String res="";
		int len= s.length();
		for (int i=len-1;i>=0;i--) {
			res=res+s.charAt(i);
			
		}
		if(s.toLowerCase().equals(res.toLowerCase())) {
			System.out.println(s+"  is palindrom");
		}
		else {
			System.out.println(s+" not palindrom");
		}
	

	}

}
