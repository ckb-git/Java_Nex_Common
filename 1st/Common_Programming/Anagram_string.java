package Common_Programming;
import java.util.*;

public class Anagram_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="mother inLaw", str2="women hitlar";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if(str1.length() == str2.length())
		{
			char[] array1 = str1.toCharArray();
			char[] array2 = str2.toCharArray();

			Arrays.sort(array1);
			Arrays.sort(array2);

			if (String.valueOf(array1).equals(String.valueOf(array2))) {
				System.out.println("Anagram String");
			} else {
				System.out.println("1 Not Anagram String");
			}
		}
		else {
			System.out.println(" 2 Not Anagram String");
		}
	}

}
