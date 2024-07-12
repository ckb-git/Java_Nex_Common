package LinkedList;
import java.util.*;
public class Assg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> al=new HashSet<>();
		al.add("ONE");
		al.add("TWO");
		al.add("THREE");
		al.add("FOUR");
		al.add("FIVE");
		Set<String> al1=new HashSet<>();
		al1.add("ONE");
		al1.add("TWO");
		al1.add("THREE");
		al1.add("FOUR");
		al1.add("FIVE");
		boolean bool=al.equals(al1);
		System.out.println("When both are same :"+bool);
		al.add("IT");
		boolean boolval=al.equals(al1);
		System.out.println("When both are not same :"+boolval);
		al.retainAll(al1);
		System.out.println("After revoking retainall method :"+al);
		HashSet <String> al2=new HashSet<>();
		for(String str:al)
		al2.add(al.contains(str)?"yes":"no");
		System.out.println(al2);
		boolean b=al.toString().contentEquals(al1.toString());
		System.out.println("After revoking containsall method :"+b);
		al.removeAll(al1);
		System.out.println("After revoking removeall method :"+al);
	}

}
