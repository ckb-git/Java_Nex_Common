package LinkedList;
import java.util.*;
public class Assg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> S1=new HashSet<>();
		S1.add("Ram");
		S1.add("Siva");
		S1.add("Hanuman");
		S1.add("Siva");
		Iterator <String> itr=S1.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
	}

}
