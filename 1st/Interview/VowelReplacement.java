package Interview;

public class VowelReplacement {
	public static String replaceVowels(String input) {
		StringBuilder result = new StringBuilder();
		String vowels = "aeiou";

		for (char c : input.toCharArray()) {
			if (vowels.contains(Character.toString(c))) {
				result.append("oiua");
			} else {
				result.append(c);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String input = "miscrit";
		String output = replaceVowels(input);

		System.out.println("Input: " + input);
		System.out.println("Output: " + output); // Output should be "oiuaoiu"
	}
}

