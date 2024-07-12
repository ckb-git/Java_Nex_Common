package demo;

public class increment_pre_post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 5;
		System.out.println("post increment "+ a++);
		System.out.println("after post increment "+ a);
		int b=10;
		System.out.println("pre increment "+ ++b);
		System.out.println("after pre increment "+ b);
		
		int c= 10;
		int x= ++c + ++c;
		System.out.println(x);
	}

}
