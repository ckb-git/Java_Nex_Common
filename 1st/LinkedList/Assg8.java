package LinkedList;
import java.util.*;
public class Assg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> L1=new LinkedList<>();
		L1.add("Sachin");
		L1.add("Kohli");
		L1.add("Yuvaraj");
		L1.add("Dhoni");
		L1.add("Bhuvi");
		List<String> L2= new LinkedList<>(L1);
		Iterator <String>IT=L2.iterator();
		while(IT.hasNext())
		System.out.println(IT.next());
	}

}
