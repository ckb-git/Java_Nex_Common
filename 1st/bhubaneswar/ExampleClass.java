package bhubaneswar;

public class ExampleClass {
	
	int a=10;
	void f1() {
		System.out.println("f1");
	}
	static void f2() {
		System.out.println("f2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleClass e= new ExampleClass();
		System.out.println(e.a);
		e.f1();
		f2();
	}

}
