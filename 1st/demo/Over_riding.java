package demo;

class A{
	public void m1() {
		System.out.println("class A, m1 method");
	}
}

class B extends A{
	public void m1() {
		System.out.println("class B, m1 method");
	}
}
public class Over_riding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.m1();
		
		B b=new B();
		b.m1();
		
		A ab=new B();
		ab.m1();

	}

}
