package LinkedList;
import java.util.*;
public class Assg12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> al=new HashSet<>();
		al.add("Mech");
		al.add("Civil");
		al.add("EEE");
		al.add("CSE");
		al.add("EEE");
		System.out.println("HashSet Lists Are :"+al);
		ArrayList <String> A1=new ArrayList<>(al);
		System.out.println("ArrayList contain :"+A1);
	}

}
