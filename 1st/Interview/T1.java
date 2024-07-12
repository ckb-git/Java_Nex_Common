package Interview;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Channddan";
		char[] charr=s.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for (char c: charr) 
		{
			if(hm.containsKey(c)) 
			{
				hm.put(c, hm.get(c)+1);
				
			}
			else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}

}
