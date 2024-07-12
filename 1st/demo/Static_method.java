package demo;

class s{
	
	static void you() {
		System.out.println("static method you");
		
	}
	void mx1() {
		System.out.println("mx1");
	}
}
public class Static_method {
	static void my() {
		System.out.println("static method my");
	
	}
	
	void mx2() {
		
		System.out.println("mx2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_method.my();
		my();
		Static_method sm= new Static_method();
		sm.mx2();
		s a=new s();
		a.you();
		a.mx1();
	}

}
