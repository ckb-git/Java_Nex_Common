
package bhubaneswar;
import java.util.*;
public class Max_char_occ {

	public static void main(String[] args) {
		String s="chndanbeher";
		int len=s.length();
		char ans=0;
		int cnt=0;
		HashMap<Character, Integer> mp = new HashMap<>();
		for (int i=0;i<len;i++)
		{
			char c= s.charAt(i);

			mp.put(c, mp.getOrDefault(c, 0)+1);

			if(cnt < mp.get(c)) {
				ans = c;
				cnt = mp.get(c);
			}
		}

		//		 int max = Collections.max(mp.values());

		System.out.println(ans);
	}

}
