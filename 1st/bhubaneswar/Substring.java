package bhubaneswar;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="CHANDAN BEHERA";  
//		System.out.println(s1.substring(0 ,4)); 
//		System.out.println(s1.substring(2));
		int len=s1.length();
		int sub_len=4;
		
		for (int i=0;i<len-sub_len;i++) {
			System.out.println(s1.substring(i,i+sub_len));
		}

	}

}
