package LinkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Assg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> L1=new LinkedList<>();
		L1.add("Sachin");
		L1.add("Kohli");
		L1.add("Yuvaraj");
		L1.add("Dhoni");
		L1.add("Bhuvi");
		Set <String> S1=new HashSet<>(L1);
		S1.add("Lion");
		S1.add("Tiger");
		Iterator <String> itr= S1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
