package LinkedList;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> L1=new LinkedList<>();
		L1.add("Sachin");
		L1.add("Kohli");
		L1.add("Yuvaraj");
		L1.add("Dhoni");
		L1.add("Bhuvi");
		L1.add("Kohli");
		L1.add("Dhoni");
		System.out.println("Original list"+L1);
		L1.remove("Kohli");
		System.out.println("After invoking remove method :"+L1);
		L1.remove(0);
		System.out.println("After Invoking remove(ind) method :"+L1);
		LinkedList <String> L2=new LinkedList<>();
		L2.add("Jadeja");
		L2.add("Rohith");
		L1.addAll(L2);
		System.out.println("After adding both lists :"+L1);
		L1.removeFirst();
		System.out.println("After invoking remove first method :"+L1);
		L1.removeLast();
		System.out.println("After invoking removelast method :"+L1);
	}

}
