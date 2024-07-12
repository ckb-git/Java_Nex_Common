package LinkedList;
import java.util.*;
public class Assg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> al=new LinkedList<>();
		al.add("ONE");
		al.add("TWO");
		al.add("THREE");
		al.add("FOUR");
		al.add("FIVE");
		LinkedList<String> al1=new LinkedList<>();
		al1.add("ONE");
		al1.add("TWO");
		al1.add("THREE");
		al1.add("FOUR");
		al1.add("ECE");
		boolean bool=al.equals(al1);
		System.out.println("When both are same :"+bool);
		al.add("IT");
		boolean boolval=al.equals(al1);
		System.out.println("When both are not same :"+boolval);
		al.retainAll(al1);
		System.out.println("After revoking retainall method :"+al);
		LinkedList <String> al2=new LinkedList<>();
		for(String str:al)
		al2.add(al.contains(str)?"yes":"no");
		System.out.println(al2);
		boolean b=al.toString().contentEquals(al1.toString());
		System.out.println("After revoking containsall method :"+b);
		al.removeAll(al1);
		System.out.println("After revoking removeall method :"+al);
	}

}
