package LinkedList;
import java.util.*;
public class Assg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initial Array Is");
		String s[]= {"M","A","I","N"};
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
		System.out.println();
		System.out.println("Converting Array to List");
		List<String> L1=new LinkedList<>();
		L1=Arrays.asList(s);
		System.out.println(L1);
	}

}
