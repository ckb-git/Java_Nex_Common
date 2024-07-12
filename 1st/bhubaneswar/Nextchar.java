package bhubaneswar;

public class Nextchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="chandanX";
		int len=s.length();
		System.out.println(len);
		//StringBuilder output = new StringBuilder();

		for(int i=0;i<=len-1;i++) {
			
//			char c = s.charAt(i);
//            char shiftedChar = (char) (c + 1);
//            output.append(shiftedChar);
            
            
			char ch=s.charAt(i);
			System.out.print(++ch);

		}
		//System.out.println(output.toString());
		int a=1;
		System.out.println(a);

	}

}
