package LinkedList;
import java.util.*;
public class Assg14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> al=new HashSet<>();
		al.add("Door");
		al.add("window");
		al.add("Room");
		System.out.println("First Set List :"+al);
		HashSet <String> al1=new HashSet<>();
		al1.add("Door");
		al1.add("window");
		al1.add("Blackboard");
		System.out.println("Second Set :"+al1);
		al1.retainAll(al);
		System.out.println("common Elements in a both list :"+al1);
	}

}
