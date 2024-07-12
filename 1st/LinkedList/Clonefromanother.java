package LinkedList;
import java.util.*;
public class Clonefromanother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> L1=new LinkedList<>();
		L1.add("Sachin");
		L1.add("Kohli");
		L1.add("Yuvaraj");
		L1.add("Dhoni");
		L1.add("Bhuvi");
		LinkedList<String> L2= new LinkedList<>();
		L2=(LinkedList)L1.clone();
		System.out.println(L2);
	}
}
