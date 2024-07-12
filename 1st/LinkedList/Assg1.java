package LinkedList;
import java.util.*;
public class Assg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> L1=new LinkedList<>();
		L1.add("String");
		L1.add("Array");
		L1.add("Integer");
		L1.add("Charector");
		L1.add("ArrayList");
		System.out.println("Before reverse order :");
		System.out.println(L1);
		
		Collections.reverse(L1);
		System.out.println("After reverse order :");
		System.out.println(L1);
	}

}
