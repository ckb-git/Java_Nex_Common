package LinkedList;
import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> L1=new LinkedList<>();
		L1.add("Sachin");
		L1.add("Kohli");
		L1.add("Yuvaraj");
		L1.add("Dhoni");
		L1.add("Bhuvi");
		System.out.println("Original list"+L1);
		LinkedList <String> L2= new LinkedList<>();
		L2.add("Jadeja");
		L2.add("Rohith");
		L1.addAll(L2);
		System.out.println("After adding both lists :"+L1);
		L2.add("Raina");
		L1.addAll(0, L2);
		System.out.println("After invoking addAll(ind,obj) method :"+L1);
		L1.addFirst("Gourav");
		System.out.println("After invoking addFirst method"+L1);
		L1.addLast("Nitesh");
		System.out.println("After invoking addLast method"+L1);
		
	}

}
