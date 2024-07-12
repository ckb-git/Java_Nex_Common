package LinkedList;
import java.util.*;
public class Assg11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> al=new HashSet<>();
		al.add("Mech");
		al.add("Civil");
		al.add("EEE");
		al.add("CSE");
		al.add("EEE");
		Set<String> S1=new HashSet<>(al);
		System.out.println(S1);
	}

}
