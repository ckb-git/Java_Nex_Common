package LinkedList;
import java.util.*;
public class Assg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> al=new LinkedList<>();
		al.add("Mech");
		al.add("Civil");
		al.add("EEE");
		al.add("CSE");
		al.add("ECE");
		System.out.println("Converting List to array :");
		String str[]=al.toArray(new String[al.size()]);
		for(String s:str)
		{
			System.out.println(s);
		}
	}

}
