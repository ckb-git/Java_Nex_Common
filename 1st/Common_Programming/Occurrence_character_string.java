package Common_Programming;

public class Occurrence_character_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="chandan behera";
		char target='a';
		int count=0;
		
		for (int i=0; i<s.length();i++) {
			if (s.charAt(i)==target) {
				count++;
			}
		}
		System.out.println(target +" -"+ count);

	}

}
