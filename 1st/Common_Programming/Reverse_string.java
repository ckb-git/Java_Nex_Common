package Common_Programming;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Jay Hanuman";
		String rs="";
		char ch;

		for (int i=s.length()-1;i>=0;i--) {
			ch=s.charAt(i);
			rs=rs+ch;

			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println(rs);

		//2
		String originalStr = "Hello";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
			reversedStr = originalStr.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: "+ reversedStr);

		//3
		String str = "jay sri ram";

		StringBuilder ns = new StringBuilder();

		ns.append(str);
		ns.reverse();

		System.out.println(ns);
	}



}
