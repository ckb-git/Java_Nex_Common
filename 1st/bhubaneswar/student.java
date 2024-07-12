package bhubaneswar;

public class student {
	int roll;
	String name;
	student(int roll, String name){
		this.roll=roll;
		this.name=name;
		System.out.print(roll+" "+name);
	}
	public static void main(String arg[]){
		student s1= new student(100,"chandan");
}
}
