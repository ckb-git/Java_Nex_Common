package Common_Programming;

public class Non_matching_characters_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="chandan",s2="chandanBehera";
		
		System.out.println(DifferentCharacters(s1,s2));

	}
	
	public static String DifferentCharacters(String str1, String str2) {
	    StringBuilder result = new StringBuilder(str1);
	    for (int i = 0; i < str1.length(); i++) {
	        if (str1.charAt(i) != str2.charAt(i)) {
	            result.setCharAt(i, '-');
	        }
	    }
	    return result.toString();
	}
}
