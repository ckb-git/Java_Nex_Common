package LinkedList;
import java.util.*;
public class Assg10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> al=new HashSet<>();
		al.add("Mech");
		al.add("Civil");
		al.add("EEE");
		al.add("CSE");
		al.add("EEE");
		System.out.println("Converting Set to array :");
		String str[]=al.toArray(new String[al.size()]);
		for(String s:str)
		{
			System.out.println(s);
		}
	}

}
