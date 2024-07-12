package bhubaneswar;

public class Remove_Duplicate_Words_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "This is is a test test sentence sentence with with duplicate duplicate words words.";

		String result = removeDuplicateWords(sentence);
		System.out.println(result);

	}
	public static String removeDuplicateWords(String sentence) {
		String[] words = sentence.split("\\s+");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			if (!result.toString().contains(words[i])) {
				result.append(words[i]).append(" ");
			}
		}

		return result.toString().trim();
	}
}

